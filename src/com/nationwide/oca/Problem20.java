package com.nationwide.oca;

public class Problem20 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			Double number = Double.valueOf("120d");
		} catch (NumberFormatException ex) {
		}
		System.out.println(number);
	}

}
