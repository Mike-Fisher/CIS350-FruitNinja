package edu.upenn.cis350.fruitninja;

import org.junit.Test;

import junit.framework.TestCase;

public class GameObjectTest extends TestCase {

	protected void setUp() throws Exception {
		super.setUp();
		
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}
	
	@Test
	public void testIntersect(){
		GameObject obj = new GameObject(5, 5, 10, 10, 1, 1);
		assertTrue(obj.intersect(7, 7));
	}

}