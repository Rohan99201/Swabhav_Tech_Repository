package com.aurionpro.model.test;

import com.aurionpro.model.Rectangle_encap;

public class RectangleEncapTest {
	public static void main(String[] args) {
		Rectangle_encap big = new Rectangle_encap();
		big.setLength(-10);
		big.setHeight(20);
		System.out.println("area " + big.getLength() * big.getHeight());

		Rectangle_encap small = new Rectangle_encap();
		small.setLength(500);
		small.setHeight(20);
		System.out.println("area " + small.getLength() * small.getHeight());

	}
}
