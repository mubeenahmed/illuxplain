package com.illuxplain.repository;

import java.util.List;

public interface IRepository<T> {
	List<T> read(String query, Object[] params);
	boolean update(String query, Object[] params);
	
}
