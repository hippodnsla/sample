package com.nustar.engine.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.jboss.logging.Logger;

import com.nustar.engine.container.Container;
import com.nustar.framework.core.bundle.calculator.Calculator;

public class CalculationServiceLocator {

	private static final Logger LOGGER = Logger.getLogger(CalculationServiceLocator.class);
	
	public Calculator getCalculator(String domain, Class<Calculator> calculatorClazz) {
		
		Map<String, Collection<Calculator>> calctorsDomainMapping = getCalculatorMap(this.containers);
		
		Collection<Calculator> calctors = calctorsDomainMapping.get(domain);
		if (calctors == null)
			return null;
		for (Calculator c: calctors)
			if (c.getClass().equals(calculatorClazz))
				return c;
		return null;
	}
	
	public void addContainer(Container container) {
		
	}
	
	private Map<String, Collection<Calculator>> getCalculatorMap(Collection<Container> container) {
		
//		Map<String, Collection<Calculator>> calculators = new HashMap<String, Collection<Calculator>>();
//		
//		for (Container ctaner: container) {
//			for (Calculator calcs: ctaner.getCalculators()) {
//				String domain = 
//				if (calculators.containsKey(calcs.getDomain())) {
//					
//				}
//			}
//		}
		return null;
	}
	
	private Collection<Container> containers;

}
