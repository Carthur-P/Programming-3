package pbook;

import java.util.ArrayList;
import java.util.Collections;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Book> books = new ArrayList<>();
		books.add(new Book("Rachel's Legacy", "Thomas, Julie"));
		books.add(new Book("Bulibasha", "Ihimaera, Witi"));
		books.add(new Book("Chappy", "Grace, Patricia"));
		books.add(new Book("Wild Pork and Watercress", "Crump, Barry"));
		//books.add(new Book("The Invisible Mile", "Coventry, David"));
		//books.add(new Book("Dad Art", "Wilkins, Damien"));
		//books.add(new Book("The Antipodeans", "McGee, Greg"));
		//books.add(new Book("Absence", "King, Joanna"));
		
		Collections.sort(books, new CompareTitle());
		
		for(Book b:books)
		{
			System.out.println(b.toString());
		}
	}

}
