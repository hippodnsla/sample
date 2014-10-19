package com.nustar.engine.container;

import java.util.Collection;

import com.nustar.framework.core.bundle.Bundle;

public interface Container {
	
	boolean deploy(Bundle bundle);
	
	Collection<Bundle> getBundles();
	
}
