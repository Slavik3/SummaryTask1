//JTH-73
package ua.nure.kozlov.SummaryTask1;

/**
 * 
 * Demonstrates work of the program
 * @author Slavik Kozlov
 *
 */
import java.io.FileNotFoundException;

public class Demo {
	public static void main(String[] args) throws FileNotFoundException {
		System.setProperty("file.encoding", "Cp1251");
		Train train = new Train();
		train.read("1.txt");
		System.out.println(train);
		System.out.println("общая численность багажа= "
				+ train.amountOfLuggage());
		System.out.println("общая численность пасажиров= "
				+ train.numberOfPassengers());
		Vagon v = new Platzkart();
		train.add(v);
		train.print();
		v.getComfortLevel();
		train.sort();
		train.print();
		train.del(v);
		System.out.println("" + v.getComfortLevel());
		System.out.println("train size= " + train.size());
	}
}
