
class Author {
	private String name;
	private String email;
	private char gender; //either 'm' or 'f'
	
	public Author(String name, String email, char gender) {
		this.name = name;
		this.email = email;
		this.gender = gender;	
	}
// There are no setters for name and gender, as these properties are not designed to be changed
	
	public String getName() {
		return name;
	}
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public char getGender() {
		return gender;
	}

	// A toString() method that returns " name ( gender ) at email "
	public String toString() {
		return name + " ("+ gender +") at " + email;
	}
}

class Book {
	private String name;
	private Author author;
	private double price;
	private int qty;
	
	public Book(String name, Author author, double price, int qty) {
		this.name = name;
		this.author = author;
		this.price = price;
		this.qty = qty;
	}
	
	public String getName() {
		return name;
	}
	
	public Author getAuthor() {
		return author;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}
	
	// A toString() method that returns " name ( gender ) at email "
	public String toString() {
		return "'" + name + "' by " + author;
		}

}
// Testing the program for Author and Book class

class Q1 {
	
	public void Test() {
		Author author1 = new Author("Peter Mick", "petermick100@yahoo.com", 'm'); //Please note that these examples are fictitious
		Book firstbook = new Book("My love for Java", author1, 30, 5 );
		
		System.out.println(firstbook.toString());
	}

	public static void main(String[] args) {
		Q1 a = new Q1();
		a.Test();
		
	}

}
