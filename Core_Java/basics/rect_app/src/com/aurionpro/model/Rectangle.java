package com.aurionpro.model;

public class Rectangle {
	private double length, height;
	private String colour;

	public void setLength(double alength) {
		length = validateLength(alength);
	}

	private double validateLength(double alength) {
		if (alength < 1)
			return 1;
		if (alength > 100)
			return 100;
		return alength;
	}

	public void setHeight(double aheight) {
		height = validateHeight(aheight);
	}

	private double validateHeight(double aheight) {
		if (aheight < 1)
			return 1;
		if (aheight > 100)
			return 100;
		return aheight;
	}
	
	public void setColour(String acolour) {
		colour = validateColour(acolour.toLowerCase());
	}
	
	private String validateColour(String acolour) {
		if (acolour.equals("red")||acolour.equals("blue")||acolour.equals("green"))
			return acolour;
		return acolour="red";	
	}
	
	public double calculateArea() {
		return length * height;
	}

	public double getLength() {
		return length;
	}

	public double getHeight() {
		return height;
	}
	
	public String getColour() {
		return colour;
	}

}
