package org.sample;

class area{
	int r;
	double pi = 3.14;
	
	area(int r){
		this.r=r;
	}
	public void getarea() {
		double area = pi*r*r;
		System.out.println("Area of circle: " + area);
	}
	
}

public class encapsulationexample {
	public static void main(String args[]) {
		area circle =  new area(2);
		circle.getarea();
	}
}