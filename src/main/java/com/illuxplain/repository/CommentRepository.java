package com.illuxplain.repository;

import java.sql.SQLException;
import java.util.List;

import com.illuxplain.app.Comments;

public interface CommentRepository {

	public boolean addComment(Comments comment) throws ClassNotFoundException, SQLException;
	public void removeComment(Comments coment);
	public void updateComment(Comments comment);
	public List<Comments> getComment(String pageID) throws SQLException, ClassNotFoundException;
}
