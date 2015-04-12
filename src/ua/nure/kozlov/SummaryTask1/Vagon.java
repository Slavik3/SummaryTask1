package ua.nure.kozlov.SummaryTask1;

/**
 * 
 * class Vagon characterized by three fields numberOfPassengers,
 * amountOfLuggage, comfortLevel<br>
 * implements Comparable parametrezid by Vagon<br>
 * 
 * @author Slavik Kozlov
 * 
 */
public class Vagon implements Comparable<Vagon> {
	private int numberOfPassengers;
	private int amountOfLuggage;
	private int comfortLevel;

	public int getNumberOfPassengers() {
		return numberOfPassengers;
	}

	public void setNumberOfPassengers(int numberOfPassengers) {
		this.numberOfPassengers = numberOfPassengers;
	}

	public int getAmountOfLuggage() {
		return amountOfLuggage;
	}

	public void setAmountOfLuggage(int amountOfLuggage) {
		this.amountOfLuggage = amountOfLuggage;
	}

	public int getComfortLevel() {
		return comfortLevel;
	}

	public void setComfortLevel(int comfortLevel) {
		this.comfortLevel = comfortLevel;
	}

	public Vagon() {
		this(0, 0, 0);
	}

	public Vagon(int numberOfPassengers, int amountOfLuggage, int comfortLevel) {
		this.numberOfPassengers = numberOfPassengers;
		this.amountOfLuggage = amountOfLuggage;
		this.comfortLevel = comfortLevel;
	}

	@Override
	public int compareTo(Vagon vagon) {
		return this.comfortLevel - vagon.comfortLevel;
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Vagon)) {
			return false;
		}
		Vagon v = (Vagon) obj;
		if ((v.numberOfPassengers == this.numberOfPassengers)
				&& (v.amountOfLuggage == this.amountOfLuggage)
				&& (v.comfortLevel == this.comfortLevel)) {
			return true;
		}
		return false;
	}

	@Override
	public int hashCode() {
		return this.amountOfLuggage + this.numberOfPassengers
				+ this.comfortLevel;
	}

	@Override
	public String toString() {
		return "numberOfPassengers= " + numberOfPassengers
				+ ". amountOfLuggage= " + amountOfLuggage + ". comfortLevel= "
				+ comfortLevel;
	}
}
