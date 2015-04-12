package ua.nure.kozlov.SummaryTask1;

import java.io.FileNotFoundException;

import org.junit.Test;

import ua.nure.kozlov.SummaryTask1.Demo;

public class DemoTest {

	@Test
	public void testMain() throws FileNotFoundException {
		System.out.println("\tmain");
		Demo.main(new String[] {});
		new Demo();
	}

}
