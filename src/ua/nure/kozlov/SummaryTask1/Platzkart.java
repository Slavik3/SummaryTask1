package ua.nure.kozlov.SummaryTask1;

/**
 * Class Platzkart is a wagon with the usual level of comfort<br>
 * 
 * @author Slavik Kozlov
 * 
 */
public class Platzkart extends Vagon {
	private final static int DEFAULT_COMFORT_LEVEL = 1;

	public Platzkart() {
		this(0, 0, DEFAULT_COMFORT_LEVEL);
	}

	public Platzkart(int numberOfPassengers, int amountOfLuggage,
			int comfortLevel) {

		super(numberOfPassengers, amountOfLuggage, comfortLevel);
	}

	@Override
	public String toString() {
		return "Platzkart " + super.toString();
	}

}
