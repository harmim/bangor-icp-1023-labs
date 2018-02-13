package Book;


/**
 * @author Dominik Harmim harmim6@gmail.com
 */
public class Dictionary extends Book
{
	private int numberOfDefinitions;


	public Dictionary(int numberOfPages, String title, int numberOfDefinitions)
	{
		super(numberOfPages, title);
		this.numberOfDefinitions = numberOfDefinitions;
	}


	public int getNumberOfDefinitions()
	{
		return numberOfDefinitions;
	}


	@Override
	public String toString()
	{
		return super.toString()
			+ "{"
			+ "numberOfDefinitions=" + numberOfDefinitions
			+ "}";
	}
}
