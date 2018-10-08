public class Book {

	private String bookName;
	private String publisherName;
	private int price;
	
	public Book(){
		System.out.println("Book class is created");
	}
	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getPublisherName() {
		return publisherName;
	}

	public void setPublisherName(String publisherName) {
		this.publisherName = publisherName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Book [bookName=" + bookName + ", publisherName=" + publisherName + ", price=" + price + "]";
	}


	
	
}
