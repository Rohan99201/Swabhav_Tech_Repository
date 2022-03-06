package com.aurionpro.model.test;

import com.aurionpro.model.Rectangle;

public class RectangleTest {
	public static void main(String[] args) {
		Rectangle big = new Rectangle();
		setDetails(big, -10, 20, "RED");
		printDetails(big);

		Rectangle small = new Rectangle();
		small.setLength(500);
		small.setHeight(20);
		small.setColour("blue");
		setDetails(small, 500, 10, "blue");
		printDetails(small);
	}

	public static void printDetails(Rectangle rect) {
		System.out.println("length: " + rect.getLength());
		System.out.println("height: " + rect.getHeight());
		System.out.println("area: " + rect.calculateArea());
		System.out.println("colour: " + rect.getColour());
	}

	public static void setDetails(Rectangle rect, double length, double height, String colour) {
		rect.setLength(length);
		rect.setHeight(height);
		rect.setColour(colour);
	}
}
