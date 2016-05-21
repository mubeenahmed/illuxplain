package com.illuxplain.repository;

import java.util.List;

import com.illuxplain.comment.Comments;

public interface CommentRepository {

	public void addComment(Comments comment);
	public void removeComment(Comments coment);
	public void updateComment(Comments comment);
	public List<Comments> getComment(Comments comment);
}
