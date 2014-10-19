package com.nustar.framework.core.bundle.service;

import java.util.Collection;

public interface DataService extends BundleService {
	
	<E> E find(Class<E> entityClazz, long id);
	
	<E> Collection<E> findAll(Class<E> entityClazz);
	
}
