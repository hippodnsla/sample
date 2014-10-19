package com.nustar.framework.core.entity;

import java.io.Serializable;

public interface Entity extends Serializable {
	
	/**
	 * 
	 * @return
	 */
	long getId();
	
	/**
	 * 
	 * @param id
	 */
	void setId(long id);
}
