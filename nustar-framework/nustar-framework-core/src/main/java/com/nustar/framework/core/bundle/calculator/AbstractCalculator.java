package com.nustar.framework.core.bundle.calculator;

import com.nustar.framework.core.container.calculation.Calculation;

public abstract class AbstractCalculator implements Calculator {
	
	@Override
	public boolean equals(Object o) {
		
		if (o == null)
			return false;
		if (!o.getClass().equals(this.getClass()))
			return false;
		
		Calculator other = (Calculator) o;
		if (!other.getDomain().equals(this.getDomain()))
			return false;
		
		return true;
	}

	public abstract Calculation calculate(Calculation calculation);

	public String getDomain() {
		return domain;
	}
	
	protected String domain;
}
