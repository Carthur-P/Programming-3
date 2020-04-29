package pbook;

import java.util.Comparator;

public class CompareTitle implements Comparator<Book> {

	//comparator set the rules of sorting instead of using the default
	@Override
	public int compare(Book b1, Book b2) {
		return b1.getTitle().compareTo(b2.getTitle());
	}
	
}
