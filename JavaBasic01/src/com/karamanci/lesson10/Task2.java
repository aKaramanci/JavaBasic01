package com.karamanci.lesson10;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		// get input from the user, then based on that print this structure
		// for ex: input = 6
//		1
//		22
//		333
//		4444
//		55555
//		666666
//		55555
//		4444
//		333
//		22
//		1
		Scanner scan = new Scanner(System.in);

		// ask the user for a number
		System.out.println("Please enter a number:");
		int input = scan.nextInt();

		// this takes care of the incrementing
		for (int row = 1; row <= input; row++) {

			for (int col = 0; col < row; col++) {
				System.out.print(row);
			}
			System.out.println();
		}
	// this takes care of the decrementing section
		for (int row = input - 1; row > 0; row--) {
			for (int col = 0; col < row; col++) {
				System.out.print(row);
			}
			System.out.println();
		}
	}

}
