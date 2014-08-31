package com.nustar.framework.core.entity;

import java.util.Collection;

public interface Entities<T> extends Entity {

	/**
	 * 
	 * @return
	 */
	Collection<T> getList();
	
	/**
	 * 
	 * @param entities
	 */
	void setList(Collection<T> entities);
	
}
