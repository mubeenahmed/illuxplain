package com.illuxplain.repository;

import java.sql.SQLException;
import java.util.List;

public abstract class PresistenceRepository {
	public abstract <T> List<T> read(String query, Object[] params) throws SQLException;
	public abstract boolean update(String query, Object[] params);
}
