import java.util.Scanner;

public class libraryLauncher {

	public static void main(String[] args) {
		
		// the scanner object
		Scanner keyboard = new Scanner(System.in);
		
		// this is the reference to Library class
		Library library = new Library();
		Book book1 = new Book();
		
		// this is the instance for the book variable
		String book = "";
		
		System.out.println("Add a book to the library.");
		System.out.println("What is the books name.");
		book = keyboard.nextLine();
		library.setBook(book);
		
		System.out.println("What is the publish date.");
		String date = keyboard.nextLine();
		book1.setPublishDate(date);
		
		System.out.println("Who is the author.");
		String author = keyboard.nextLine();
		book1.setAuthor(author);
		
		book1.toString(book1.getName(), book1.getPublishDate(), book1.getAuthor());
		

	}

}
