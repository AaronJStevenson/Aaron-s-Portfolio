
public class Library {
	private String book; // the private instance storing the book
	private String name; // the private instance storing the name
	public Library() {
		this.book = "";
		this.name = "";
	}
	// this is the aggregate of library
	public Library(Library library) {
		this.book = library.book;
		this.name = library.name;
	}
	public String getBook() {
		return book;
	}
	public void setBook(String book) {
		this.book = book;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String toString(){
		String str;
		str = "*****A book from the Library *****\n";
		return str;
	}
}
