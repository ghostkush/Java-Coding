package org.sample;
import java.util.*;
import java.lang.*;

public class ctrlstats {
	public static void main(String args[]) {
		int num = 100;
		if (num < 100) {
			System.out.println("If statement");
		}
		else {
			System.out.println("Else statement");
		}
		for (int i = 0; i < 2; i++) {
			System.out.println("For loop");
		}
		int [] arr = {1,2,3};
		for (int x : arr) System.out.println(x);
		
		while (num<105) {
			System.out.println("While loop");
			num ++;
		}
		do {
			System.out.println(" do While loop");
			num ++;
		}while (num<110);
		int state = 1;
		switch (state) {
		case 1:
			System.out.println("switch case 1");
			break;
		case 2:
			System.out.println("switch case 2");
			break;
		}
	}
}
