package com.illuxplain.repository;

import java.util.List;

public abstract class PresistenceRepository {
	public abstract <T> List<T> read(String query, Object[] params);
	public abstract boolean update(String query, Object[] params);
}
