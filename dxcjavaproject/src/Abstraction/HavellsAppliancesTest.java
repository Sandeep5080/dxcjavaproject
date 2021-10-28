package Abstraction;

import org.junit.Test;

import junit.framework.TestCase;

public class HavellsAppliancesTest extends TestCase {
	@Test
	public void testAdd() {
		int expected = 60;
		int actual = HavellsAppliances.add(10, 20);
		assertEquals(expected, actual);
	}
	
}
