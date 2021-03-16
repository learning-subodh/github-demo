package javaBasics;

public class ArrayConcept {

	public static void main(String[] args) {
		
		//array: to store similar data type values in a array variable
		
		//1. int array
		
		//disadvantages of array:
		//1.size is fixed.  -- to overcome this problem we use collection
		//2. store only similar data types.  -- to overcome this, we use object array
		
		int i[] = new int[4];
		i[0]=10;
		i[1]=20;
		i[2]=30;
		i[3]=40;
		
		//System.out.println(i[4]);
		//Exception:ArrayIndexOutOfBoundsException: 
		System.out.println(i.length);  // will give size of array
		
		//print all the values of array use for loop concept
		for(int j=0;j<i.length;j++) {
			System.out.println(i[j]);
		}
		
		//2. double array
		double d[]=new double[3];
		d[0]=12.36;
		d[1]=25.30;
		d[2]=54.16;
		
		System.out.println(d[2]);
		
		//3. object array
		Object ob[]= new Object[6];
		ob[0]= "tac";
		ob[1] = 12;
		ob[2] = 10.23;
		ob[3] = "d";
		ob[4] = "London12";
		ob[5] = 1250;
		
		System.out.println(ob.length);
		
		for(int m=0; m<=ob.length; m++) {
			System.out.println(ob[m]);
		}
		

	}

}
