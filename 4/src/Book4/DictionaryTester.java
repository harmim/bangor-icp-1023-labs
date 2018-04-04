package Book4;


/**
 * @author Dominik Harmim harmim6@gmail.com
 */
public class DictionaryTester
{
	public static void main(String[] args)
	{
		System.out.println("New dictionary Foo with 200 pages and 1200 definitions");
		Dictionary dictionary = new Dictionary(200, "Foo", 1200);
		System.out.println("Number of pages: " + dictionary.getNumberOfPages());
		System.out.println("Title: " + dictionary.getTitle());
		System.out.println("Number of definitions: " + dictionary.getNumberOfDefinitions());
		System.out.println(dictionary);
	}
}
