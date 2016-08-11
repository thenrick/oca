package com.nationwide.oca;

public class Problem20 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Double number = null;
		try {
			number = Double.valueOf("120d");
		} catch (NumberFormatException ex) {
		}
		System.out.println(number);
	}

}
