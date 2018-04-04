package lab4.book;


/**
 * @author Dominik Harmim harmim6@gmail.com
 */
public class Book
{
	private int numberOfPages;
	private String title;


	public Book(int numberOfPages, String title)
	{
		this.numberOfPages = numberOfPages;
		this.title = title;
	}


	public int getNumberOfPages()
	{
		return numberOfPages;
	}


	public void setNumberOfPages(int numberOfPages)
	{
		this.numberOfPages = numberOfPages;
	}


	public String getTitle()
	{
		return title;
	}


	public void setTitle(String title)
	{
		this.title = title;
	}


	@Override
	public String toString()
	{
		return "Book{" +
			"numberOfPages=" + numberOfPages +
			", title=" + title +
			"}";
	}
}
