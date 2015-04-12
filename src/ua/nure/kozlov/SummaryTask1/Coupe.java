package ua.nure.kozlov.SummaryTask1;

/**
 * 
 * Class coupe is a wagon with a high level of comfort <br>
 * 
 * @author Slavik Kozlov
 * 
 */
public class Coupe extends Vagon {
	private final static int DEFAULT_COMFORT_LEVEL = 2;

	public Coupe() {
		this(0, 0, DEFAULT_COMFORT_LEVEL);
	}

	public Coupe(int numberOfPassengers, int amountOfLuggage, int comfortLevel) {

		super(numberOfPassengers, amountOfLuggage, comfortLevel);
	}

	@Override
	public String toString() {
		return "Coupe " + super.toString();
	}
}
