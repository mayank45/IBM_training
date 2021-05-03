package com.demo03.equal;

import java.util.HashSet;
import java.util.Set;

class Book {
	String title;
	int price;
	String author;

	public Book(String title, int price, String author) {
		super();
		this.title = title;
		this.price = price;
		this.author = author;
	}

	@Override
	public String toString() {
		return "Book [title=" + title + ", price=" + price + ", author=" + author + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((author == null) ? 0 : author.hashCode());
		result = prime * result + price;
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		if (author == null) {
			if (other.author != null)
				return false;
		} else if (!author.equals(other.author))
			return false;
		if (price != other.price)
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}

	
}

public class SetEqualsDemo {
	public static void main(String[] args) {
		Book book1 = new Book("Java in 3 days", 99, "Miley");
		Book book2 = new Book("Java in 3 days", 99, "Miley");

		if (book1.equals(book2)) {
			System.out.println("same book");
		} else {
			System.out.println("books are not same");
		}
		
		Set<Book> books = new HashSet<Book>();
		books.add(book1);
		books.add(book2);
		System.out.println(books);
		
	}
}
