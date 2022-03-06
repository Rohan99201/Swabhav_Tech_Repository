package com.aurionpro.overload;

public class OverLoad {
	public static void main(String args[]) {
		printInfo("hello");
		printInfo(100);
		printInfo(100.55);
		printInfo(10 > 5);
		printInfo(100.55f);
	}

	public static void printInfo(String str) {
		System.out.println(str);
	}

	public static void printInfo(int num) {
		System.out.println(num);
	}

	public static void printInfo(double dou) {
		System.out.println(dou);
	}

	public static void printInfo(boolean tf) {
		System.out.println(tf);
	}

	public static void printInfo(float fnum) {
		System.out.println(fnum);
	}

}
