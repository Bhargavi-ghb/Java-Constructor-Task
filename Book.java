package com.oops;

public class Book {

	String title;
	String author;
	
	public Book(String booktitle,String bookauthor) {
		title=booktitle;
		author=bookauthor;
	}
	
	public void displayData() {
		System.out.println(title + " " + author + " ");
	}
	
	public static void main(String[] args) {
		Book book=new Book("pride","Ram");
		book.displayData();
		
	}

}
