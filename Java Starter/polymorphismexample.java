package org.sample;

class test{
	static int Multiply(int a, int b) {
		return a*b;
	}
	static double Multiply(double a, double b) {
		return a*b;
	}
}
public class polymorphismexample {
	public static void main(String args[]) {
		System.out.println("Integer mul : " + test.Multiply(2, 3));
		System.out.println("double mul : " + test.Multiply(2.23,3.33));
	}
}