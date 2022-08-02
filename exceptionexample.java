package org.sample;

public class exceptionexample {
	public static void main(String[] args) {
		int a = 10, b = 5, c = 5, result;
		try {
			result = a / (b - c);
			System.out.println("result" + result);
		} 
		catch (ArithmeticException e) {
			System.out.println("Exception caught:Division by zero");
		} 
		catch (Exception e) { 
			System.out.println("You should not divide the number by zero! ");
		} 
		finally {
			System.out.println("I am in final block");
		}
	}
}
