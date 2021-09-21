
import java.util.Scanner; //import scanner!!

public class Hailstones {
	public static void main(String[] args) {

		Scanner scanPos = new Scanner(System.in); // Create a Scanner object

		System.out.println("Enter a positive hailstone starting value");
		int posInt = scanPos.nextInt(); // posInt is going to be equal to the next integer that the system scans

		int initialNum = posInt; // to place hold the initial number (so not modified) so we can print it out at
									// the end
		int termCount = 1; // initialize how many we are starting with
		int biggest = 0;

		System.out.println(" ");
		System.out.println(posInt); // enter the pos

		while (posInt != 1) // while the positive integer is not 1
		{
			if (posInt % 2 == 0) // if the remainder of pos int is 0 (meaning its even)
			{
				posInt = posInt / 2; // if its even then it'll be divided by 2
				System.out.println(posInt);
				termCount++; // counts the terms

				if (posInt > biggest) {
					biggest = posInt; // place holds the biggest number
				}

			}

			else if (posInt % 2 != 0) // if the remainder of positive integer doesn't equal 0
			{
				posInt = posInt * 3;
				posInt = posInt + 1; // the math stuff
				System.out.println(posInt);
				termCount++; // counts the terms

				if (posInt > biggest) {
					biggest = posInt; // place holds the biggest number
				}

			}

		}

		System.out.println("start: " + initialNum);
		System.out.println("term count: " + termCount);
		System.out.println("biggest: " + biggest);
		// out prints all the start,term count, and biggest number

	}

}
