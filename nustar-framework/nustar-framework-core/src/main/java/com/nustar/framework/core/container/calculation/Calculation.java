package com.nustar.framework.core.container.calculation;

public interface Calculation {
	
	String getDomain();
	
	long getId();
	
	CalculationResult getResult();
	
	CalculationParameter getParameter();
	
	CalculationStatusE getStatus();
	
}
