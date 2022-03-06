package com.aurionpro.basic;

import java.util.*;

public class ConvertToZero {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter No: ");
		int num = scan.nextInt();
		ConvertToZero(num);
	}

	public static void ConvertToZero(int num) {
		if (num >= 0)
			System.out.println(0);
		System.out.println("Original: " + num);
	}
}
