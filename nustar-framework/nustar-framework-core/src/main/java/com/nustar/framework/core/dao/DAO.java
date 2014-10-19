package com.nustar.framework.core.dao;

import java.util.List;

import com.nustar.framework.core.entity.Entity;

public interface DAO<E extends Entity> {

	/**
	 * Get entity from database where id been given
	 * @param id
	 * @return
	 */
	E get(long id);
	
	/**
	 * Get all entities from database
	 * @return
	 */
	List<E> getAll();
	
	/**
	 * Get entities from database where in range [begin, end)
	 * @param begin
	 * @param end
	 * @return
	 */
	List<E> getRange(int begin, int end);
	
	/**
	 * Save or update entities to database
	 * @param entities
	 */
	void save(E... entities);
	
	/**
	 * Update entities from database
	 * @param entities
	 */
	void update(E... entities);
	
	/**
	 * Delete entities in database
	 * @param entities
	 */
	void delete(E... entities);
	
	/**
	 * Check entities exist in database
	 * @param entities
	 * @return
	 */
	boolean exist(E... entities);
	
	/**
	 * Check the number of entities in database
	 * @return
	 */
	int size();
}
