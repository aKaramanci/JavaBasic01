package com.karamanci.lesson08;

public class IntroToWhileLoop {

	public static void main(String[] args) {

		int time = 8;
		
		if (time < 9)
		{//begin of if body
			System.out.println("Good Evening");
		}//ending of if body
		
		//in case you do not think properly of the stopping condition, 
		// then you risk going into an infinite loop
		while (time < 12)
		{//beginning of while body
		
			System.out.println(time);
	
			time++;
			
//			time = time + 2;
			
		//	time += 2;
			
		}//ending of while body
		
		//How to print number [20 - 30[?
		
		int a = 20;
		while(a < 30) // a <= 29
		{
	//		System.out.println("Condition: " + (a < 30));
			
			//print number in one line
			System.out.print(a + " ");
			
//			System.out.println(a);
			a++;
		}
		
		System.out.println();
		
		//how do we print numbers 5 to 25?
		
		int b = 5;
		
		while (b <= 25)
		{
			System.out.print(b + " ");
			//increment
			b++;
		}
		
		
		System.out.println();
		
		//how can we print numbers from 10 to 1?
		int c = 10;
		
		while(c >= 1)
		{
			System.out.print(c + " ");
			
			//--c or c-- only matters if we are doing multiple operations in one line
			c--;
		}
		
		
		//How can I print only even numbers from 50 to 1?
		
		
		
		
	
	}

}
