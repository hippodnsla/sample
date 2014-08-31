package com.nustar.framework.core.factory;

import com.nustar.framework.core.entity.Entity;

public abstract class AbstractFactory {

	public AbstractFactory() {
		super();
	}
	
	public abstract <T extends Entity> T create(Class<T> entityClazz);

}
