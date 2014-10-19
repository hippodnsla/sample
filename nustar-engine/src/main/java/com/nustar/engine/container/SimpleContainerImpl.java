package com.nustar.engine.container;

import java.util.Collection;

import org.springframework.util.Assert;

import com.nustar.framework.core.bundle.Bundle;

public class SimpleContainerImpl implements Container {

	public boolean deploy(Bundle bundle) {
		
		Assert.notNull(bundle);
		
		try {
			bundle.initlize();
		} catch (Exception e) {
			return false;
		}
		
		bundles.add(bundle);
		
		return true;
	}

	public Collection<Bundle> getBundles() {
		return bundles;
	}
	
	private Collection<Bundle> bundles;
}
