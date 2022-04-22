package com.wipro.bookstore;

public class Book {

	String isbnNo;
	String bookName;
	String genre;
	double price;
	// Book Has A Author
	
	Author author;
	
	
	
	public double getDiscountForFictionBook(Book book) {
		
		if(book.getGenre().equals("fiction")) {
			double discount=book.getPrice()*(25/100);
			return book.getPrice() - discount;
		}
		return 0;
		
	}



	public String getIsbnNo() {
		return isbnNo;
	}



	public void setIsbnNo(String isbnNo) {
		this.isbnNo = isbnNo;
	}



	public String getBookName() {
		return bookName;
	}



	public void setBookName(String bookName) {
		this.bookName = bookName;
	}



	public String getGenre() {
		return genre;
	}



	public void setGenre(String genre) {
		this.genre = genre;
	}



	public double getPrice() {
		return price;
	}



	public void setPrice(double price) {
		this.price = price;
	}



	public Author getAuthor() {
		return author;
	}



	public void setAuthor(Author author) {
		this.author = author;
	}
	
	// getter and setter
	
	
	
}
