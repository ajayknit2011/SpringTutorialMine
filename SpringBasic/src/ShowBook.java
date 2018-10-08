
public class ShowBook {

	
	private Book[] books;

	public Book[] getBooks() {
		return books;
	}

	public void setBooks(Book[] books) {
		this.books = books;
	}
	
	
	public void showBooks(){
		
		for(Book b1:books){
			
			System.out.println(b1);
		}
	}
	
}
