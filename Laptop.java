package com.oops;

import java.util.Scanner;

public class Laptop {

	String brand;
	int ramSize;
	
	public Laptop(String laptopbrand,int laptopramSize) {
		brand=laptopbrand;
		ramSize=laptopramSize;	
	}
	
	public void displayData() {
		
		System.out.println("Laptop brand :" +brand +" "+ "\nLaptop ramsize :" +ramSize + "GB");
		System.out.println("--------------------------");
	}
	
	public static void main(String[] args) {
		
		Laptop laptop = new Laptop("Dell",8);
		laptop.displayData();
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter your laptop brand :");
		String brand =scan.nextLine();
		System.out.print("Enter your laptop ramsize :");
		String ramSize =scan.nextLine();
		System.out.println("------userinput Data ------");
		System.out.println("Laptop brand : "+  brand);
		System.out.println("laptop ramsize :" + ramSize + "GB");
		scan.close();
	}

}
