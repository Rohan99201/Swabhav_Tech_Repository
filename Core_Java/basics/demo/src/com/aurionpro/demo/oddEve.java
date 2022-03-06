package com.aurionpro.demo;

public class oddEve {
	public static void main(String[] args) {
		System.out.println("Odd numbers: ");
		printOddNum(1, 100);
		System.out.println(" ");
		System.out.println("Even numbers: ");
		printEvenNum(1, 100);
	}

	public static void printOddNum(int odd, int end) {
		if (odd > end)
			return;
		if (odd % 2 != 0) {
			System.out.print(odd + " ");
			printOddNum(odd + 2, end);
		} else {
			printOddNum(odd + 1, end);
		}
	}

	public static void printEvenNum(int even, int end) {
		if (even > end)
			return;
		if (even % 2 == 0) {
			System.out.print(even + " ");
			printEvenNum(even + 2, end);
		} else {
			printEvenNum(even + 1, end);
		}
	}
}
