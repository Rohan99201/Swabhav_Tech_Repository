package com.aurionpro.basic;

public class ConvertNumberToZero {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };
		System.out.println("Elements in the array");
		ConvertNumberToZero(arr);
		for (int i = 0; i < arr.length; i++)
			System.out.println(arr[i]);
	}

	public static void ConvertNumberToZero(int[] arr) {
		for (int i = 0; i < arr.length; i++)
			arr[i] = 0;
	}
}
