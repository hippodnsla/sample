package com.nustar.engine;

import org.jboss.logging.Logger;

import com.nustar.engine.container.Container;
import com.nustar.engine.container.SimpleContainerImpl;
import com.nustar.engine.service.CalculationServiceLocator;
import com.nustar.engine.service.DataServiceLocator;

public class SimpleEngineImpl implements Engine {
	
	private static final Logger LOGGER = Logger.getLogger(SimpleEngineImpl.class);
	
	public SimpleEngineImpl() {
		this.container = new SimpleContainerImpl();
		this.calculationServiceLocator = new CalculationServiceLocator();
		this.dataServiceLocator = new DataServiceLocator();
	}
	
	public void run() {
		while(true) {
			try {
				Thread.sleep(1000);
				System.out.println("running...");
			} catch (InterruptedException e) {
				e.printStackTrace();
				System.exit(-1);
			}
			
		}
	}
	
	private Container container;
	private CalculationServiceLocator calculationServiceLocator;
	private DataServiceLocator dataServiceLocator;
}
