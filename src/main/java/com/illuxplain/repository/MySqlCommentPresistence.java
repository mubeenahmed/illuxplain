package com.illuxplain.repository;

import java.sql.SQLException;
import java.sql.Types;
import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;


@Repository
@Qualifier("mysqlCommentRepo")
public class MySqlCommentPresistence<Comments> extends PresistenceRepository<Comments> {
	
	@Override
	public <Comments> List<Comments> readforList(String query, Object[] params) throws SQLException, ClassNotFoundException {
		List<Comments> listOfComments = null;//= (List<Comments>) jdbcTemplate.queryForList(query, params); 
		return listOfComments;
	}

	@Override
	public boolean save(String query, Object[] params) throws ClassNotFoundException, SQLException {
		//int affectedRow = jdbcTemplate.update(query, params);
		//if(affectedRow > 0)
		//	return true;
		return false;
	}

}
