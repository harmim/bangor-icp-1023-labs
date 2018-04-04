package lab4.book;


/**
 * @author Dominik Harmim harmim6@gmail.com
 */
public class BookTester
{
	public static void main(String[] args)
	{
		System.out.println("New book Foo with 200 pages");
		Book book = new Book(200, "Foo");
		System.out.println("Number of pages: " + book.getNumberOfPages());
		System.out.println("Title: " + book.getTitle());
		System.out.println(book);

		System.out.println("\nChange number of pages to 100 and title to Bar");
		book.setNumberOfPages(100);
		book.setTitle("Bar");
		System.out.println(book);
	}
}
