package com.nationwide.oca;

public class Problem18 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int sum = 0;

		for (int x = 0; x <= 10; x++) {
			System.out.println("x " + x);
			sum += x;
			System.out.println("Sum of 0 to " + x);
		}
		System.out.println(" = " + sum);
	}

}
