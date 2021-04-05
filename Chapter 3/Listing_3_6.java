package listing.tutorial;

import java.math.*;
import java.util.*;

public class Listing_3_6 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("How many numbers do you need to draw? ");
		int k = in.nextInt();
		
		System.out.print("What is the highest number you can draw? ");
		int n = in.nextInt();
		
		BigInteger RandomOdds = BigInteger.valueOf(1);
		
		for (int i = 1; i <= k; i++)
			RandomOdds = RandomOdds.multiply(BigInteger.valueOf(n - i + 1)).divide(BigInteger.valueOf(i));
		
		System.out.println("Your odds are 1 in " + RandomOdds + ". Good luck!");
		
		in.close();
		// TODO Auto-generated method stub

	}

}
