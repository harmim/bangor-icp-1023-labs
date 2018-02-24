package Dice;


/**
 * Die tester class.
 *
 * @author Dominik Harmim harmim6@gmail.com
 */
public class DieTester
{
	public static void main(String[] args)
	{
		System.out.println("Test 1: Test constructor and toString method.");
		Die die = new Die(6);
		System.out.println(die);

		System.out.println("\nTest 2: Test getFaceValue method.");
		System.out.println("Face value: " + die.getFaceValue());

		System.out.println("\nTest3: Test throwDie method.");
		for (int i = 0; i < 36; i++) {
			die.throwDie();
			System.out.println(die);
		}
	}
}
