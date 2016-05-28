package com.illuxplain.logic;

import java.sql.SQLException;
import java.util.List;

import com.illuxplain.app.Comments;
import com.illuxplain.repository.CommentRepository;
import com.illuxplain.repository.CommentRepositoryImp;
import com.illuxplain.repository.MySqlCommentPresistence;

public class CommentApplication {
	
	
	private String pageID;
	
	
	public CommentApplication(String id) {
		pageID = id;
	}
	
	public List<Comments> getAllComments() throws SQLException{
		
		CommentRepository commentRepository = new CommentRepositoryImp(new MySqlCommentPresistence());
		List<Comments> comments = commentRepository.getComment(this.pageID);
		
		return comments;
	}
}
