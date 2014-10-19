package com.nustar.framework.core.factory;

import org.springframework.util.Assert;

import com.nustar.framework.core.entity.Entity;

public abstract class AbstractEntityFactory {

	public AbstractEntityFactory() {
		super();
	}
	
	protected <E extends Entity> E create(Class<E> entityClazz)  {
		
		Assert.notNull(entityClazz);
		
		try {
			return entityClazz.newInstance();
		} catch (InstantiationException e) {
			throw new IllegalArgumentException("Invalid entity class name: " + e);
		} catch (IllegalAccessException e) {
			throw new IllegalArgumentException("Invalid entity class name: " + e);
		}
	}

}
