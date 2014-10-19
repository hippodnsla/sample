package com.nustar.framework.core.bundle.calculator;

import com.nustar.framework.core.container.calculation.Calculation;
import com.nustar.framework.core.container.calculation.CalculationParameter;


public interface Calculator {
	
	String getDomain();
	
	Calculation evaluate(CalculationParameter parameter);
	
}
