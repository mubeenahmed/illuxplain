package com.illuxplain.data;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.illuxplain.comment.Comments;
import com.illuxplain.comment.CommentsInt;
import com.illuxplain.comment.controllers.Comment;

public class CommentPersistence {
	
	public boolean saveComment(Comment comment){
		System.out.println("###############LOGGING DATA################");
		Comment newComment = comment;
		CommentsInt comments = new Comments(comment.getComment(), comment.getName());
		boolean result = comments.saveComment();
		
		if(result){
			boolean response;
			try {
				response = persistentComment(newComment);
			}
			catch (SQLException e) {
				e.printStackTrace();
				return false;
			}
			finally{
				DatabaseConfiguration.closeConnection();
			}
			return response;
		}
		return false;
		
	}
	
	public List<Comment> getComments(){
		try {
			return presistentComment();
		} catch (SQLException e) {
			e.printStackTrace();
			return new ArrayList<Comment>();
		}finally{
			DatabaseConfiguration.closeConnection();
		}
	}
	
	private List<Comment> presistentComment() throws SQLException{
		System.out.println("###############LOGGING DATA################");
		Connection connection = DatabaseConfiguration.getConnection();
		String sql = "SELECT * FROM illuxplain.comments";
		
		List<Comment> listOfComments = new ArrayList<Comment>();
		
		PreparedStatement ps = connection.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		while(rs.next()){
			Comment coms = new Comment();
			coms.setName(rs.getString("name"));
			coms.setComment(rs.getString("comment"));
			coms.setDate(rs.getLong("date"));
			listOfComments.add(coms);
		}
		
		return listOfComments;
	}
	
	private boolean persistentComment(Comment comment) throws SQLException{
		Connection connection = DatabaseConfiguration.getConnection();
		String insertQuery = "INSERT INTO illuxplain.comments (name, comment, date) values (?,?,?)";
		PreparedStatement ps = connection.prepareStatement(insertQuery);
		ps.setString(1, comment.getName());
		ps.setString(2, comment.getComment());
		ps.setLong(3, comment.getDate());
		boolean result = ps.execute();
		return result;
	}
	
}
