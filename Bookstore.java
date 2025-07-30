package demo;

class Books{
	
	String title;
	String author;
	double price;
	int quantity;
	double total_value;
	Books(String title,String author,double price,int quantity){
		this.title=title;
		this.author=author;
		this.price=price;
		this.quantity=quantity;
		Total();
		
	}
	void Total() {
		total_value=price*quantity ;
		
	}
	void displayDetails() {
		System.out.println("Book title:  "+title);
		System.out.println("Author of the book  "+author);
		System.out.println("Price of the book  "+price );
		System.out.println("Amount of the book in-hand  "+quantity  );
		System.out.println("Total price of the BOOK  "+total_value );
	
		
		
		
	}
}
public class Bookstore{
	public static void main(String[] args) {
		Books book1=new Books("HOW TO MAKE YOUR HAIR A BRUSH","johns jose",20,200);
		Books book2=new Books("BECOME A PRO IN CODING","DAWN K VINOD",200,20);
		System.out.println("The details of student 1 is");
		book1.displayDetails();
		System.out.println("The details of student 2 is");
		book2.displayDetails();
		
	}
}


