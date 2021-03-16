package javaBasics;

public class IfElseConcepts {

	public static void main(String[] args) {
	
		//comparison operators
		//< > <= >= == !=
		
		int a = 23;  
		int b = 43;
		
		if(a>b) {
		System.out.println("a is greater than b");
		}
		else {
			System.out.println("b is greater than a");
		}
		int c = 40;
		int d = 40;
		
		if (c==d) {
			System.out.println("c and d are equal");
		}
		else {
			System.out.println("c and d are not equal");
		}
		
		int x = 600;
		int y = 400;
		int z = 300;
		
		if(x>y & x>z) {
			System.out.println("x is greatest number");
		}
		else if(y>x & y>z) {
			System.out.println("y is the greatest number");
		}
		else {
			System.out.println("z is the greatest number");
		}

	}

}
