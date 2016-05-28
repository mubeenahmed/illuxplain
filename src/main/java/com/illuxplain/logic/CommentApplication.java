package com.illuxplain.logic;

import java.sql.SQLException;
import java.util.List;

import com.illuxplain.app.Comments;
import com.illuxplain.app.CommentsImp;
import com.illuxplain.app.CommentsInt;
import com.illuxplain.repository.CommentRepository;
import com.illuxplain.repository.CommentRepositoryImp;
import com.illuxplain.repository.MySqlCommentPresistence;

public class CommentApplication {
	
	
	private String pageID;
	
	
	public CommentApplication(String id) {
		pageID = id;
	}
	
	public List<Comments> getAllComments() throws SQLException, ClassNotFoundException{
		CommentRepository commentRepository = new CommentRepositoryImp(new MySqlCommentPresistence());
		List<Comments> comments = commentRepository.getComment(this.pageID);
		return comments;
	}
	
	public boolean saveComment(Comments comment) throws ClassNotFoundException, SQLException{
		CommentsInt checkForValidatComment = new CommentsImp(comment);
		
		if(checkForValidatComment.saveComment()){
			return saveValidateComment(comment);
		}
		else{
			return false;
		}
	}
	private boolean saveValidateComment(Comments comment) throws ClassNotFoundException, SQLException{
		CommentRepository commentRepository = new CommentRepositoryImp(new MySqlCommentPresistence());
		commentRepository.addComment(comment);
		return true;
	}
}
