package com.nustar.framework.core.bundle.calculator;

public abstract class AbstractChainCalculator extends AbstractCalculator {
	
	public Calculator getNextCalculator() {
		return nextCalculator;
	}
	
	private Calculator nextCalculator;
}
