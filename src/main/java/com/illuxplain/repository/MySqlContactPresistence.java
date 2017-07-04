package com.illuxplain.repository;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

@Repository
@Qualifier("mysqlContactRepo")
public class MySqlContactPresistence<Contact> extends PresistenceRepository<Contact> {

	@Override
	public <T> List<T> readforList(String query, Object[] params) throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean save(String query, Object[] params) throws ClassNotFoundException, SQLException {
		int affectedRow = jdbcTemplate.update(query, params);
		if(affectedRow > 0)
			return true;
		return false;
	}

}
