package defensive_programming;

import java.util.Scanner;

public class Factorials {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String keepGoing = "y";
		Scanner scan = new Scanner(System.in);
		while(keepGoing.equals("y") || keepGoing.equals("Y")) {
			System.out.print("Enter an integer: ");
			int val = scan.nextInt();
			try {
				System.out.println("Factorial(" +val+ ") = " + MathUtils.factorial(val));	
			}
			catch(IllegalArgumentException i) {
				System.out.println(i);
			}
			System.out.print("Another factorial? (y/n) ");
			keepGoing = scan.next();
		}
		scan.close();
	}

}
