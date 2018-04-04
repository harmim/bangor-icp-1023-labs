package lab3.cards;


/**
 * Pack Tester class.
 *
 * @author Dominik Harmim harmim6@gmail.com
 */
public class PackTester
{
	public static void main(String[] args)
	{
		Pack pack = new Pack();
		System.out.println("New sorted pack:");
		System.out.println(pack);

		pack.shuffle();
		System.out.println("\nShuffle pack:");
		System.out.println(pack);

		pack.shuffle();
		System.out.println("\nShuffle pack again:");
		System.out.println(pack);
	}
}
