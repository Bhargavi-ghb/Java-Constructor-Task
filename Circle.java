package com.oops;

public class Circle {

	
	double radius;
	double pi=3.14;
	
	public Circle(double cirRadius) {
		radius=cirRadius;
	}
	
	public double getArea() {
		return pi*radius*radius;
	}
	
	public double getCircumference() {
		return  2*pi*radius;
	}
	
	
	public static void main(String[] args) {
		Circle circle=new Circle(5.0);
		double area =circle.getArea();
		double circumference=circle.getCircumference();
		System.out.println("Area of rectangle :" +area);
		System.out.println("Circumference of rectangle :" +circumference);
		
		

	}
}
