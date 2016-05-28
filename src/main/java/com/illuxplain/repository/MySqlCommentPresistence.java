package com.illuxplain.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.illuxplain.app.Comments;

public class MySqlCommentPresistence extends PresistenceRepository{
	
	
	@SuppressWarnings("unchecked")
	@Override
	public <T> List<T> read(String query, Object[] params) throws SQLException {
		
		String pageID = (String) params[0];
		String selectQuery = String.format("SELECT * FROM illuxplain.comments WHERE pageID = '%s' ", pageID);
		
		Connection conn = MySqlDatabaseConfigurations.getConnection();
		PreparedStatement ps = conn.prepareStatement(selectQuery);
		
		ResultSet rs = ps.executeQuery();
		
		List<Comments> listOfComments = new ArrayList<Comments>();
		while(rs.next()){
			String comments = rs.getString("comments");
			Date commentsDate = rs.getDate("date");
			String commentorName = rs.getString("name");
			long commentID = rs.getLong("id");
			String commentPageID = rs.getString("pageID");
			
			Comments comment = new Comments();
			comment.setCommentID(commentID);
			comment.setCommentText(comments);
			comment.setDateOfCreation(commentsDate);
			comment.setNameOfCommentor(commentorName);
			listOfComments.add(comment);
		}
		
		return (List<T>) listOfComments;
	}
	


	@Override
	public boolean update(String query, Object[] params) {
		return false;
	}

}
