package defensive_programming;

/*CountLetters.java
 * 
 * Read a word from the standard input and print the number of
 * occurrences of each letter in that word*/

import java.util.Scanner;

public class CountLetters {
	public static void main(String[] args) {
		int[] counts = new int[26];		// 26 = jumlah alfabet
		Scanner scan = new Scanner(System.in);
		
		//get word from user
		System.out.print("Enter a single word (letters only, please): ");
		String word = scan.nextLine();
		
		//convert to all upper case
		word = word.toUpperCase();
		
		//count frequency of each letter in string
		for (int i = 0; i < word.length(); i++) {
			try {
				counts[word.charAt(i) - 'A']++;
			}
			catch(Exception e) {
				System.out.println(" (" + word.charAt(i) + ")" + "is not a word");
			}
		}
		
		//print frequencies
		System.out.println();
		for (int i = 0; i < counts.length; i++)
			if(counts[i] != 0)
				System.out.println((char)(i + 'A') + ": " + counts[i]);
		
		scan.close();
	}
}