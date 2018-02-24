package Dice;


/**
 * Player tester class.
 *
 * @author Dominik Harmim harmim6@gmail.com
 */
public class PlayerTester
{
	public static void main(String[] args)
	{
		System.out.println("Test 1: Test constructor and getScore method.");
		Player player = new Player(4);
		System.out.println("Score: " + player.getScore());

		System.out.println("\nTest 2: Test setScore adding some points.");
		player.setScore(12);
		System.out.println("Score: " + player.getScore());
	}
}
