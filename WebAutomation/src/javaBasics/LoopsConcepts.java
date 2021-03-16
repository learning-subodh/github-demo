package javaBasics;

public class LoopsConcepts {

	public static void main(String[] args) {
		
		
		//1. while loop
		// dis- it will gnerate infinite loop if not provided with increment/decrement part
		
		int i = 0;  //initialization
		while(i<10) {  //conditional part
			System.out.println(i);
			i++;  //incremental or decremental
		}   // cannot write like i = i++, but i++ or i=i+1 is valid
		System.out.println("*******");
		
		//2. for loop
		for(int j=10;j>=1;j--) {  //initialization, conditional part, incremental part
			System.out.println(j);
		}

	}

}
