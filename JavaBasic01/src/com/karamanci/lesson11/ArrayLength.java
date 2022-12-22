package com.karamanci.lesson11;

public class ArrayLength {

	public static void main(String[] args) {
		//arrays: collections of same type data
				String[] students = new String[5];
				//default value for String is null
				
				students[0] = "Fatihcan";
				students[1] = "Oguzhan";
				students[2] = "Abdullah";
				students[3] = "Oktay";
				students[4] = "Burak";
				
				
				//how can we get the length of an array?
				int arrayLength = students.length;
				System.out.println("The length of the students array is: " + arrayLength);
				
				
				//Another way how to declare an array
				int[] scores = {90, 86, 94, 88, 80};
				
				System.out.println("The length of scores array is: " + scores.length);
				
				
				
				
				
				
				
	
	}

}
