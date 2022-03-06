package com.aurionpro.model;

public class Rectangle_encap {
	private double length, height;
	
	public void setLength(double alength) {
		length = validateLength(alength);
	}
	private double validateLength(double alength) {
		if(alength<1)
			return 1;
		if(alength>100)
			return 100;
		return alength;
	}
	public void setHeight(double aheight) {
		height= validateHeight(aheight);
	}
	private double validateHeight(double aheight) {
		if(aheight<1)
			return 1;
		if(aheight>100)
			return 100;
		return aheight;
	}
	public double getLength() {
		return length;
	}
	public double getHeight() {
		return height;
	}

}
