package com.oops;

public class Rectangle {
	
	int length;
	int breadth;

	public Rectangle() {
		 length=0;
		 breadth=0;
		System.out.println("-------------");
	}
	
	public Rectangle(int rlength,int rbreadth) {
		length=rlength;
		breadth=rbreadth;
	}
	
	public void displayData() {
		System.out.println(length + " " + breadth + " ");
	} 
	
	public int area() {
		return length*breadth;
	}
	
	public static void main(String[] args) {
		Rectangle rect = new Rectangle(30,40);
		rect.displayData();
		 System.out.println( rect.area());
		
		
	}

}
