package javaBasics;

public class IncrementAndDecrementOperator {

	public static void main(String[] args) {
		int i=1;
		int j = i++;  //post increment
		
		System.out.println(i);
		System.out.println(j);
		
		int a =1;
		int b = ++a;  //preincrement
		
		System.out.println(a);
		System.out.println(b);
		
		int n =2;
		int m = n--; //post decrment
		
		System.out.println(n);
		System.out.println(m);
		
		int p = 3;
		int q = --p;  //pre decrement
		
		System.out.println(p);
		System.out.println(q);

	}

}
