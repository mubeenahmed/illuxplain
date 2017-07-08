package com.illuxplain.repository;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

public abstract class PresistenceRepository<T> {

	@Autowired
	JdbcTemplate jdbcTemplate;

	public abstract <T> List<T> readforList(String query, Object[] params) throws SQLException, ClassNotFoundException;

	public boolean save(String query, Object[] params) throws ClassNotFoundException, SQLException {
		int affectedRow = jdbcTemplate.update(query, params);
		if (affectedRow > 0)
			return true;
		return false;
	}
}
