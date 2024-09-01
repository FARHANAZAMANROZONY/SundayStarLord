package com.upskill.java_2;

public class Loops {
	
/* 	
 	Type of Loops
  		1. For Loop - Do again and again upto upper limit
  		2. While Loop - Do again and again upto condition match
  		3. Do While Loop - Do action then match condition
  		4. Infinite Loop - never ending loop
 */
	
	public static void main(String[] args) {
//		practiceForLoop();
//		practiceWhileLoop();
//		practiceDoWhileLoop();
		practiceInfiniteLoop();
	}
	
	public static void practiceForLoop(){						//For Loop - Do again and again upto upper limit
		int i;													//Initialize the variable
		for(i = 1; i <= 10; i++){								//Setting lower limit, Upper limit, Increment or Decrement
			System.out.println("For Loops number = " + i);		//Statement
		}
}
	
	public static void practiceWhileLoop(){						//While Loop - Do again and again upto condition match
		int i = 1;												//Initialize the variable
		while(i<=10){											//Setting Condition
			System.out.println("While Loops number = " + i);	//Statement
			i++;												//Increment or decrement
		}
	}
	
	public static void practiceDoWhileLoop(){					//Do While Loop - Do action then match condition
		int i = 1;												//Initialize the variable
		do {
			System.out.println("Do While Loops number = " + i);	//statement
			i++;												//Increment or Decrement
		} while (i<=10);										//Checking condition
	}
	
	public static void practiceInfiniteLoop(){					//Infinite Loop - never ending loop
		int i;													//Initialize the variable
		for (i = 1; ; i++){										//Setting No Upper limit
			System.out.println("Infinite Loops number = " + i);	//Statement
		}
	}
}