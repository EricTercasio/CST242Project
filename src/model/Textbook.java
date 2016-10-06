package model;

public class Textbook {
	private String bookTitle;
	private String author;
	private String publisher;
	private String price;
	private String ISBN;
	private String year;
	public Textbook(String bookTitle, String author, String publisher, String price, String ISBN, String year) {
		super();
		this.bookTitle = bookTitle;
		this.author = author;
		this.publisher = publisher;
		this.price = price;
		this.ISBN = ISBN;
		this.year = year;
	}
	public String getBookTitle() {
		return bookTitle;
	}
	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getISBN() {
		return ISBN;
	}
	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	@Override
	public String toString() {
		return "Textbook [bookTitle=" + bookTitle + ", author=" + author + ", publisher=" + publisher + ", price="
				+ price + ", ISBN=" + ISBN + ", year=" + year + "]";
	}
	
}
