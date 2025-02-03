package wiproday2;

class Item {
	String title;
	String author;
	int publicationYear;
	
	public Item(String title, String author, int publicationYear) {
		this.title = title;
		this.author = author;
		this.publicationYear = publicationYear;
	}
	
	void displayDetails() {
		System.out.println("Title: " + title);
		System.out.println("Author: "+ author);
		System.out.println("Publication Year: " + publicationYear);
		
	}
}
class Book extends Item {
	String genre;
	
	public Book(String title, String author, int publicationYear, String genre) {
		super(title, author, publicationYear);
		this.genre = genre;
	}
	
		
	
	@Override
	void displayDetails() {
		super.displayDetails();
		System.out.println("Genre: " + genre);
		System.out.println("-------------------");
		
		
	}
	
}

class Magazine extends Item {
	int issueNumber;
	
	public  Magazine(String title, String author, int publicationYear, int issueNumber) {
		super(title, author, publicationYear);
		this.issueNumber = issueNumber;
		

	}
	
	@Override
	void displayDetails() {
		super.displayDetails();
		System.out.println("Issue Number:" + issueNumber);
		System.out.println("-------------------");
		
	}
}

public class LibrarySystem {
	public static void main(String[] args) {
		Book book1 = new Book("The Great Gatsby", "F.Scott fitzgerald", 1925 , "Classic Fiction");
		Magazine magazine1 = new Magazine("National Geographic" , "Various Authors", 2023, 5);
		
		book1.displayDetails();
		magazine1.displayDetails();
	}

}
