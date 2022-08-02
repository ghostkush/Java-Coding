package org.sample;

public class Swapnums {
	public static void main(String args[]) {
		//initialise variables
		int n1, n2, temp;
		//set values
		n1=Integer.parseInt(args[0]);
		n2=Integer.parseInt(args[1]);
		System.out.println("Number before swap n1 and n2 are: "+n1 +" "+n2);
		//swap function
		temp=n1;
		n1=n2;
		n2=temp;
		System.out.println("Number after swap n1 and n2 are: "+n1 +" "+n2);
	}
}