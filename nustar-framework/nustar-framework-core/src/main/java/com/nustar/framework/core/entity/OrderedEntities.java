package com.nustar.framework.core.entity;

import java.util.List;

public interface OrderedEntities<T> extends Entity {

	/**
	 * 
	 * @return
	 */
	List<T> getList();
	
	/**
	 * 
	 * @param entities
	 */
	void setList(List<T> entities);
	
}
