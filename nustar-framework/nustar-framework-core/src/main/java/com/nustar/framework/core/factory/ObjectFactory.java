package com.nustar.framework.core.factory;

import org.springframework.util.Assert;

import com.nustar.framework.core.entity.Entity;

public class ObjectFactory extends AbstractFactory {

	private ObjectFactory() {
		super();
	}
	
	public static ObjectFactory getInstance() {
		if (self == null)
			self = new ObjectFactory();
		return self;
	}

	@Override
	public <T extends Entity> T create(Class<T> entityClazz) {
		
		Assert.notNull(entityClazz);
		
		try {
			T o = entityClazz.newInstance();
			return o;
		} catch (InstantiationException e) {
			throw new IllegalArgumentException("Invalid entity class name: " + e);
		} catch (IllegalAccessException e) {
			throw new IllegalArgumentException("Invalid entity class name: " + e);
		}
	}
	
	private static ObjectFactory self;

}
