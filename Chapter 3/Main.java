package listing.tutorial;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner baca = new Scanner(System.in);
		
		//get first input
		System.out.print("What is your name");
		String name = baca.nextLine();
		
		//get second input
		System.out.print("How old are you?");
		int age = baca.nextInt();
		
		//display output on console
		System.out.println("Hello, " + name + ". Next year you'll be " + (age +1));
		
		baca.close();
		// TODO Auto-generated method stub

	}

}
