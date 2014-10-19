package com.nustar.engine;


public class Driver {
	public static void main(String[] args) {
		
		Engine container = new SimpleEngineImpl();
		
		new Thread(container).start();
		
	}
}
