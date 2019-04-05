package com.jetherrodrigues.hackerrank;

import java.util.Scanner;

/**
 * 
 * @author jether.rodrigues
 *
 */
public class JavaLoopII {
	public static void main(String[] argh) {
		//String values = "0 2 10\n 5 3 5";
		
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int i = 0; i < t; i++) {
			int a = in.nextInt();
			int b = in.nextInt();
			int n = in.nextInt();

			for (int k = 0; k < n; k++) {
				int sum = 0;
				for (int j = 0; j < k; j++) {
					sum += (a + ((2^j) * b));
				}
				System.out.print(String.format("%d ", sum));
				System.out.println();
			}
		}
		in.close();
	}
}
