package org.sample;

public class operators {
	public static void main(String args[]) {
		int x, y;
		x = 10;
		y = 20;
		System.out.println(x+" "+y);
		System.out.println(x|y);
		y = 10;
		x++;
		y--;
		--x;
		--y;
		if (x==y) System.out.println("Equal");
		if (x!=y) System.out.println("Not Equal");
		System.out.println(x+" "+y);
		System.out.println((x|y));
		System.out.println((x&y));
		System.out.println((~y));
		String str1 = "Covid ", str2 = "19";
		String str3 = str1+str2;
		System.out.println(str3);
	}
}