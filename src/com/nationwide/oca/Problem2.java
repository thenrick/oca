package com.nationwide.oca;

public class Problem2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int x = 0, y = 10;
		try {
			y /= x;
		}
		// System.out.print("/ by 0");
		catch (Exception e) {
			e.printStackTrace();
			System.out.print("error");
		}
	}
}