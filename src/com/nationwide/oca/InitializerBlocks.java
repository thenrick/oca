package com.nationwide.oca;

public class InitializerBlocks {

	static {
		System.out.println("Static");
	}

	{
		System.out.println("Snowy");
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new InitializerBlocks();
		{
			System.out.println("Feathers");
		}
		new InitializerBlocks();
	}

}
