package com.illuxplain.repository;

import java.sql.SQLException;
import java.util.List;

public interface IRepository<T> {
	List<T> read(String query, Object[] params) throws SQLException;
	boolean update(String query, Object[] params);
	
}
