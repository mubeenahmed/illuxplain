package com.illuxplain.repository;

import java.sql.SQLException;
import java.util.List;

public class RepositoryImp<T> implements IRepository<T> {

	private PresistenceRepository presistence;
	
	public RepositoryImp(PresistenceRepository newPresistence) {
		presistence = newPresistence;
	}
	
	@Override
	public List<T> read(String query, Object[] params) throws SQLException {
		return presistence.read(query, params);
	}

	@Override
	public boolean update(String query, Object[] params) {
		return presistence.update(query, params);
	}

}
