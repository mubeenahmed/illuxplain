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
		@SuppressWarnings("unchecked")
		List<Comments> listOfComments =  (List<Comments>) jdbcTemplate.queryForList(query, params);
		return listOfComments;
	}

}
