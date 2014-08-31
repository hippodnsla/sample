package com.nustar.framework.core.dao;

import java.util.List;

public interface DAO<T> {

	/**
	 * 
	 * @param id
	 * @return
	 */
	T get(long id);
	
	/**
	 * 
	 * @return
	 */
	List<T> getAll();
	
	/**
	 * 
	 * @param entity
	 */
	void save(T entity);
	
	/**
	 * 
	 * @param id
	 * @param entity
	 */
	void save(long id, T entity);
	
	/**
	 * 
	 * @param entity
	 */
	void update(T entity);
	
	/**
	 * 
	 * @param id
	 * @param entity
	 */
	void update(long id, T entity);
	
	/**
	 * 
	 * @param entity
	 */
	void delete(T entity);
	
	/**
	 * 
	 * @param id
	 */
	void delete(long id);
	
	/**
	 * 
	 * @return
	 */
	int size();
}
