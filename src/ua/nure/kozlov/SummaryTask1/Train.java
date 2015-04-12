package ua.nure.kozlov.SummaryTask1;

/**
 * class Train Ñontains List of Vagons
 * @author Slavik Kozlov
 *
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Train {

	private List<Vagon> vagons;

	public Train() {
		vagons = new ArrayList<Vagon>();
	}

	/**
	 * Method adds a vagon to the train
	 * 
	 * @param vagon
	 */
	public void add(Vagon vagon) {
		vagons.add(vagon);
	}

	/**
	 * Method removes vagon from the train.
	 * 
	 * @param vagon
	 */
	public void del(Vagon vagon) {
		vagons.remove(vagon);
	}

	/**
	 * sort vagons in train by comfort level
	 */
	public void sort() {
		Collections.sort(vagons);
	}

	/**
	 * reads data from a file
	 * 
	 * @param fileName
	 * @throws FileNotFoundException
	 */
	public void read(String fileName) throws FileNotFoundException {
		Scanner scanner = null;
		File f = new File(fileName);

		if (!f.exists()) {
			throw new FileNotFoundException();
		} else {
			scanner = new Scanner(f);
			int count = scanner.nextInt();
			for (int i = 0; i < count; i++) {
				int line = scanner.nextInt();
				Vagon v = null;
				if (line == 1) {
					v = new Platzkart();
				}
				if (line == 2) {
					v = new Coupe();
				}
				line = scanner.nextInt();
				v.setNumberOfPassengers(line);
				v.setAmountOfLuggage(scanner.nextInt());
				v.setComfortLevel(scanner.nextInt());
				vagons.add(v);
			}
			scanner.close();
		}

	}

	/**
	 * 
	 * @return summary amount of luggage
	 */
	public int amountOfLuggage() {
		int ves = 0;

		for (int i = 0; i < vagons.size(); i++) {
			ves += vagons.get(i).getAmountOfLuggage();
		}
		return ves;
	}

	/**
	 * 
	 * @return numberOfPassengers
	 */
	public int numberOfPassengers() {
		int number = 0;

		for (int i = 0; i < vagons.size(); i++) {
			number += vagons.get(i).getNumberOfPassengers();
		}
		return number;
	}

	@Override
	public String toString() {

		return vagons.toString();
	}

	/**
	 * print train
	 */
	public void print() {
		System.out.println(this);
	}

	/**
	 * 
	 * @return size of vagon
	 */
	public int size() {
		return vagons.size();
	}
}
