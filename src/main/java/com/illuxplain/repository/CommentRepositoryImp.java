package com.illuxplain.repository;

import java.sql.SQLException;
import java.util.List;

import com.illuxplain.app.Comments;

public class CommentRepositoryImp extends RepositoryImp<Comments> implements CommentRepository {

	
	public CommentRepositoryImp(PresistenceRepository newPresistence) {
		super(newPresistence);
	}

	@Override
	public void addComment(Comments comment) {
		
	}

	@Override
	public void removeComment(Comments coment) {
		
	}

	@Override
	public void updateComment(Comments comment) {
		
	}

	@Override
	public List<Comments> getComment(String pageID) throws SQLException {
		String[] page = {pageID};
		return read("",page);
	}

}
