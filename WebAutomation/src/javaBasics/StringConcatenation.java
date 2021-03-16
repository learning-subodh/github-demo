package javaBasics;

public class StringConcatenation {
	//+ = is concatenation operator
	//println -- ln stands for line 
	// whenever ln is used next statement will be printed in new line.
	public static void main (String[] args){
		int a = 100;
		int b = 200;
		
		String x = "Hello";
		String y = "World";
		
		double c = 12.5;
		double d = 45.8;
		
		System.out.println(a+b);
	System.out.println(a+b+x+y);
	System.out.println(x+y+a+b);
	System.out.println(x+y+(a+b));
	System.out.println(c+d);
	
	System.out.println("the value of a is"  +a );
	
	}

}
