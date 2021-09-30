
//import scanner!!
import java.util.Scanner;

public class Hailstones {
	public static void main(String[] args) {

		// Create a Scanner object
		Scanner scanPos = new Scanner(System.in);

		System.out.println("Enter a positive hailstone starting value");
		// posInt is going to be equal to the next integer that the system scans
		int posInt = scanPos.nextInt();

		// to place hold the initial number (so not modified) so we can print it out at
		// the end
		int initialNum = posInt;

		// initialize how many we are starting with
		int termCount = 1;
		int biggest = 0;

		System.out.println(" ");
		// print the pos
		System.out.println(posInt);

		// while the positive integer is not 1
		while (posInt != 1) {
			// if the remainder of pos int is 0 (meaning its even)
			if (posInt % 2 == 0) {
				// if its even then it'll be divided by 2
				posInt = posInt / 2;
				System.out.println(posInt);
				// counts the terms
				termCount++;

				if (posInt > biggest) {
					// place holds the biggest number
					biggest = posInt;
				}

			}

			// if the remainder of positive integer doesn't equal 0
			else if (posInt % 2 != 0) {
				posInt = posInt * 3;
				// the math stuff
				posInt = posInt + 1;
				System.out.println(posInt);
				// counts the terms
				termCount++;

				if (posInt > biggest) {
					// place holds the biggest number
					biggest = posInt;
				}

			}

		}

		// out prints all the start,term count, and biggest number
		System.out.println("start: " + initialNum);
		System.out.println("term count: " + termCount);
		System.out.println("biggest: " + biggest);

	}

}
