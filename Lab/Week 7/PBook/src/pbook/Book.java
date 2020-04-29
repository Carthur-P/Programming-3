package pbook;

public class Book implements Comparable<Book>{//implementing the comparable class
	String title;
	String author;
	
	public Book(String title, String author)
	{
		this.title = title;
		this.author = author;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	@Override//setting the sorting rule for the comparable
	public int compareTo(Book b) {
		return this.author.compareTo(b.getAuthor());
	}
	
	@Override
	public String toString()
	{
		return title + " by " + author;
	}
}
