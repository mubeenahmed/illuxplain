package com.illuxplain.repository;

import java.util.ArrayList;
import java.util.List;

import com.illuxplain.app.Comments;

public class MySqlPresistence extends PresistenceRepository{

	
	@Override
	public <T> List<T> read(String query, Object[] params) {
		List<Comments> listOfComments = new ArrayList<Comments>();
		listOfComments.add(new Comments());
		return (List<T>) listOfComments;
	}

	@Override
	public boolean update(String query, Object[] params) {
		return false;
	}

}
