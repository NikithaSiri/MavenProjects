package com.lti.listdemos;

public class Book {

	private int bookId;
	private String bookName;
    private double cost;
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Book(int bookId, String bookName, double cost) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.cost = cost;
	}
	@Override
	public String toString() {
		return "Book \n[bookId=" + bookId + ", bookName=" + bookName + ", cost=" + cost + "]";
	}
    
    
}
