package com.illuxplain.repository;

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
	public List<Comments> getComment(Comments comment) {
		String selectQuery = "SELECT * FROM illuxplain.comments";
		return read(selectQuery,null);
	}

}
