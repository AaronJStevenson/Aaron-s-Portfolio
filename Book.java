
public class Book {
	private String name;// this is the private instance for a name of the book
	private String publishDate; // the instance for the date published
	private String author; // the instance for the author of the book

	public Book() { 
		this.name = "";// this is the private instance for a name of the book instantiating as 0
		this.publishDate = ""; // the instance for the date published instantiating as 0
		this.author = ""; // the instance for the author of the book instantiating as 0
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPublishDate() {
		return publishDate;
	}

	public void setPublishDate(String publishDate) {
		this.publishDate = publishDate;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	// making the toString to send my message
	public String toString(String name, String publishDate, String author){
		String str;
		str = "The Name of the booke is " + this.getName() + "\n The publish date is " + this.getPublishDate() 
		+ "\n The author is " + this.getAuthor();
	    return str;
	}

}
