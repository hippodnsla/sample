package com.nustar.framework.core.factory;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.nustar.framework.core.entity.Entity;

public class TestObjectFactory {

	class TestEntity implements Entity {

		public long getId() {
			return 0;
		}

		public void setId(long id) {
		}
		
	}
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		factory = ObjectFactory.getInstance();
	}

	@Test
	public void testCreate() {
		TestEntity entity = factory.create(TestEntity.class);
		assertNotNull(entity);
		assertTrue(entity instanceof TestEntity);
	}

	@Test
	public void testObjectFactory() {
		assertNotNull(factory);
		assertTrue(factory instanceof ObjectFactory);
		assertEquals(factory, ObjectFactory.getInstance());
	}

	private ObjectFactory factory;
}
