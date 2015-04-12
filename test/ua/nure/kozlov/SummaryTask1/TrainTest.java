package ua.nure.kozlov.SummaryTask1;

import static org.junit.Assert.assertEquals;
import java.io.FileNotFoundException;
import org.junit.Test;

import ua.nure.kozlov.SummaryTask1.Coupe;
import ua.nure.kozlov.SummaryTask1.Platzkart;
import ua.nure.kozlov.SummaryTask1.Train;
import ua.nure.kozlov.SummaryTask1.Vagon;

public class TrainTest {

	@Test
	public void testSize() {
		Train train = new Train();
		assertEquals(0, train.size());
		Vagon c = new Vagon(1, 1, 1);
		Vagon c2 = new Platzkart(2, 2, 2);
		Vagon c3 = new Coupe(3, 3, 3);
		train.add(c3);
		train.add(c2);
		train.add(c);
		assertEquals(3, train.size());
	}

	@Test
	public void testDel() {
		Train train = new Train();
		assertEquals(0, train.size());
		Vagon c = new Vagon(1, 1, 1);
		Vagon c2 = new Platzkart(2, 2, 2);
		Vagon c3 = new Coupe(3, 3, 3);
		train.add(c3);
		train.add(c2);
		train.add(c);
		train.del(c2);
		assertEquals(2, train.size());
	}

	@Test
	public void testAmount() {
		Train train = new Train();
		assertEquals(0, train.numberOfPassengers());
		assertEquals(0, train.amountOfLuggage());
		Vagon c = new Vagon(1, 1, 1);
		Vagon c2 = new Platzkart(2, 2, 2);
		Vagon c3 = new Coupe(3, 3, 3);
		train.add(c3);
		train.add(c2);
		train.add(c);
		assertEquals(c.getNumberOfPassengers() + c2.getNumberOfPassengers()
				+ c3.getNumberOfPassengers(), train.numberOfPassengers());
		assertEquals(
				c.getAmountOfLuggage() + c2.getAmountOfLuggage()
						+ c3.getAmountOfLuggage(), train.amountOfLuggage());
	}

	@Test
	public void testSotByName() {
		Train train = new Train();
		Vagon c = new Vagon(1, 1, 1);
		Vagon c2 = new Platzkart(2, 2, 2);
		Vagon c3 = new Coupe(3, 3, 3);
		train.add(c3);
		train.add(c2);
		train.add(c);
		assertEquals(
				"[" + c3.toString() + ", " + c2.toString() + ", "
						+ c.toString() + "]", train.toString());
		train.sort();
		assertEquals(
				"[" + c.toString() + ", " + c2.toString() + ", "
						+ c3.toString() + "]", train.toString());
	}

	@Test
	public void testRead() throws FileNotFoundException {
		Train pt = new Train();
		pt.read("1.txt");
		String expected = "[Platzkart numberOfPassengers= 10. amountOfLuggage= 10. comfortLevel= 3, Coupe numberOfPassengers= 20. amountOfLuggage= 10. comfortLevel= 7]";
		assertEquals(expected, pt.toString());
	}

	@Test(expected = FileNotFoundException.class)
	public void testReadNegativ() throws FileNotFoundException {
		Train tr = new Train();
		tr.read("2.txt");
	}

}
