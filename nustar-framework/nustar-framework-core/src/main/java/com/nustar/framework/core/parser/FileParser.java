package com.nustar.framework.core.parser;

import java.io.File;

import com.nustar.framework.core.entity.Entity;

public interface FileParser <E extends Entity> extends Parser<E> {

	E read(File file);
	
	void write(E entity, File file);
	
}
