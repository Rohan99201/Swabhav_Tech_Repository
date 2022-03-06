package com.aurionpro.basic;

public class ArrayTest {
	static int[] arr = { 1, 2, 10, 4, 5 };

	public static void main(String args[]) {
		System.out.println("sum = " + CalculateSum());
		System.out.println("Avg = " + CalculateAvg());
		System.out.println("Max = " + Max());
		System.out.println("Min = " + Min());
	}

	public static int CalculateSum() {
		int sum = 0;
		for (int i = 0; i < arr.length; i++)
			sum += arr[i];
		return sum;
	}

	public static double CalculateAvg() {
		int sum = 0;
		int length = arr.length;
		for (int i = 0; i < arr.length; i++)
			sum += arr[i];
		double avg = sum / length;
		return avg;
	}

	public static int Max() {
		int max = arr[0];
		for (int i = 0; i < arr.length; i++)
			if (arr[i] > max) {
				max = arr[i];
			}
		return max;
	}

	public static int Min() {
		int max = arr[0];
		for (int i = 0; i < arr.length; i++)
			if (arr[i] < max) {
				max = arr[i];
			}
		return max;
	}
}
