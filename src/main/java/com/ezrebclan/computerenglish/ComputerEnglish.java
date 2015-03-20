package com.ezrebclan.computerenglish;

public class ComputerEnglish {

	public static void main(String[] args) {
		testSentanceBreaker();
	}
	
	private static void testSentanceRunner() {
		String test = "if true is true then say die";
	}
	private static void testSentanceBreaker() {
		String test = "Hello, My name is bob, ey bob";
		String[] test2 = Sentance.breakApart(test, ' ');
		for (String string : test2) {
			System.out.println(string);
		}
		String test3 = "(if testing is true then) (kill your family)";
		String[] test4 = Sentance.breakIntoChunks(test3, "(", ")");
		for (String string : test4) {
			System.out.println(string);
		}
	}
	public static void EyBob() {
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		while(true) {
			System.out.println();
			System.out.println("My name is bob");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Ey bob");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
