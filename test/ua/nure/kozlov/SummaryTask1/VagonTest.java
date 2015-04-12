package ua.nure.kozlov.SummaryTask1;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class VagonTest {
	@Test
	public void testSetGetAmountOfLuggage() {
		Vagon vagon = new Vagon();
		vagon.setAmountOfLuggage(1);
		assertEquals(1, vagon.getAmountOfLuggage());
	}

	@Test
	public void testSetGetComfortLevel() {
		Vagon vagon = new Vagon();
		vagon.setComfortLevel(1);
		assertEquals(1, vagon.getComfortLevel());
	}

	@Test
	public void testSetGetNumberOfPassengers() {
		Vagon vagon = new Vagon();
		vagon.setNumberOfPassengers(3);
		assertEquals(3, vagon.getNumberOfPassengers());
	}

	@Test
	public void testEqualsNegativ() {
		Object o = new Object();
		Vagon vagon = new Vagon();
		assertEquals(false, vagon.equals(o));// ?
	}

	@Test
	public void testEquals() {
		Vagon vagon = new Vagon(1, 1, 1);
		Vagon vagon2 = new Vagon(1, 1, 1);
		assertEquals(true, vagon.equals(vagon2));
	}

	@Test
	public void testEqualsElse() {
		Vagon vagon = new Vagon(1, 1, 1);
		Vagon vagon2 = new Vagon(1, 1, 2);
		assertEquals(false, vagon.equals(vagon2));
	}

	@Test
	public void testHashCode() {
		Vagon vagon = new Vagon(2, 1, 3);
		assertEquals(6, vagon.hashCode());
	}
	
	@Test
	public void test—ompareTo() {
		Vagon vagon = new Vagon();
		Vagon vagon2 = new Vagon();
		assertEquals(0, vagon.compareTo(vagon2));
	}

}
