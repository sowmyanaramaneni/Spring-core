package com.Autowire;

public class Book {
	private int bookid;
	private String bookname;
	private int price;
	private Author author;
	
	public Book(int bookid, String bookname, int price, Author author) {
		super();
		this.bookid = bookid;
		this.bookname = bookname;
		this.price = price;
		this.author = author;
		
		
	}
	public Book()
	{
		
	}
	public int getBookid() {
		return bookid;
	}
	public void setBookid(int bookid) {
		this.bookid = bookid;
	}
	public String getBookname() {
		return bookname;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Author getAuthor() {
		return author;
	}
	public void setAuthor(Author author) {
		this.author = author;
	}
	@Override
	public String toString() {
		return "Book [bookid=" + bookid + ", bookname=" + bookname + ", price=" + price + ", author=" + author + "]";
	}
	public void display()
	{
		System.out.println("Book id is"+bookid);
		System.out.println("Book name is"+bookname);
		System.out.println("Book price is"+price);
		System.out.println("Author name is"+author);
	}
	

}
