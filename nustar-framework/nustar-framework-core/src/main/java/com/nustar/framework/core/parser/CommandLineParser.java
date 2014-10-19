package com.nustar.framework.core.parser;

import com.nustar.framework.core.entity.CommandLineArguments;

public interface CommandLineParser <A extends CommandLineArguments> extends Parser {
	
	A parse(String[] args) throws IllegalArgumentException;

}
