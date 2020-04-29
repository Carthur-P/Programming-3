package pbook;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Collections;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class BookTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testGetTitle() {
		Book b = new Book("Rachel's Legacy", "Thomas, Julie");
		assertEquals("Rachel's Legacy", b.getTitle());
	}

	@Test
	public void testSetTitle() {
		Book b = new Book("Rachel's Legacy", "Thomas, Julie");
		b.setTitle("Rachel's Legacy Volumn 2");
		assertEquals("Rachel's Legacy Volumn 2", b.getTitle());
	}

	@Test
	public void testGetAuthor() {
		Book b = new Book("Rachel's Legacy", "Thomas, Julie");
		assertEquals("Thomas, Julie", b.getAuthor());
	}

	@Test
	public void testSetAuthor() {
		Book b = new Book("Rachel's Legacy", "Thomas, Julie");
		b.setAuthor("Thomas, Jones");
		assertEquals("Thomas, Jones", b.getAuthor());
	}

	@Test
	public void testComparable() {
		ArrayList<Book> books = new ArrayList<>();
		StringBuilder message = new StringBuilder();
		books.add(new Book("Rachel's Legacy", "Thomas, Julie"));
		books.add(new Book("Bulibasha", "Ihimaera, Witi"));
		books.add(new Book("Chappy", "Grace, Patricia"));
		books.add(new Book("Wild Pork and Watercress", "Crump, Barry"));
		Collections.sort(books);	
		for(Book b:books)
		{
			message.append(b.toString() + "/n");
		}
		
		assertEquals("Wild Pork and Watercress by Crump, Barry/n" +
					"Chappy by Grace, Patricia/n" +
					"Bulibasha by Ihimaera, Witi/n" +
					"Rachel's Legacy by Thomas, Julie/n", message.toString());
	}

	@Test
	public void testComprator() {
		ArrayList<Book> books = new ArrayList<>();
		StringBuilder message = new StringBuilder();
		books.add(new Book("Rachel's Legacy", "Thomas, Julie"));
		books.add(new Book("Bulibasha", "Ihimaera, Witi"));
		books.add(new Book("Chappy", "Grace, Patricia"));
		books.add(new Book("Wild Pork and Watercress", "Crump, Barry"));
		Collections.sort(books, new CompareTitle());	
		for(Book b:books)
		{
			message.append(b.toString() + "/n");
		}
		
		assertEquals("Bulibasha by Ihimaera, Witi/n" + 
					"Chappy by Grace, Patricia/n" + 
					"Rachel's Legacy by Thomas, Julie/n" + 
					"Wild Pork and Watercress by Crump, Barry/n", message.toString());
	}
}	
