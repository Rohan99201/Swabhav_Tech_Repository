package com.aurionpro.model.test;

import com.aurionpro.model.Rectangle;

public class RectangleTest {
	public static void main(String[] args) {
		double a, b;
		Rectangle rectangle = new Rectangle();
		rectangle.l = 10;
		rectangle.b = 20;
		b = rectangle.l * rectangle.b;
		System.out.println("Area " + b);

		Rectangle bigrectangle = new Rectangle();
		bigrectangle.l = 10;
		bigrectangle.b = 20;
		bigrectangle.h = 30;
		a = bigrectangle.l * bigrectangle.b * bigrectangle.h;
		System.out.println("Area " + a);

	}

}
