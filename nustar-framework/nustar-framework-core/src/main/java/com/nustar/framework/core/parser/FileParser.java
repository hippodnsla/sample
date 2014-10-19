package com.nustar.framework.core.parser;

import java.io.File;
import java.io.IOException;

import com.nustar.framework.core.entity.Entity;

public interface FileParser <E extends Entity> extends Parser {

	E read(File file)  throws IOException, IllegalArgumentException;
	
	void write(E entity, File file) throws IOException, IllegalArgumentException;
	
}
