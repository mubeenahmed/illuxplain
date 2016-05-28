package com.illuxplain.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.illuxplain.app.Comments;

public class MySqlCommentPresistence extends PresistenceRepository {

	@SuppressWarnings("unchecked")
	@Override
	public <T> List<T> read(String query, Object[] params) throws SQLException, ClassNotFoundException {

		String pageID = (String) params[0];
		String selectQuery = String.format("SELECT * FROM illuxplain.comments WHERE pageID = '%s' ", pageID);

		Connection conn = MySqlDatabaseConfigurations.getConnection();
		PreparedStatement ps = conn.prepareStatement(selectQuery);
		ResultSet rs = ps.executeQuery();

		return (List<T>) populateListOfComments(rs);
	}

	private List<Comments> populateListOfComments(ResultSet rs) throws SQLException {
		List<Comments> listOfComments = new ArrayList<Comments>();
		while (rs.next()) {
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
		return listOfComments;
	}

	@Override
	public boolean save(String query, Object[] params) throws ClassNotFoundException, SQLException {
		Comments comment = (Comments) params[0];
		String saveQuery = "INSERT INTO illuxplain.comments(comment,name,date) VALUE (?,?,?)";
		
		Connection conn = MySqlDatabaseConfigurations.getConnection();
		PreparedStatement ps = conn.prepareStatement(saveQuery);
		
		ps.setString(1, comment.getCommentText());
		ps.setString(2, comment.getNameOfCommentor());
		ps.setDate(3, (java.sql.Date) comment.getDateOfCreation());
		
		return ps.execute();
	}

}
