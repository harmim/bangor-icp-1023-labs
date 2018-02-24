package Dice;


/**
 * Die Game: Doubles
 *
 * This is a single player game. The player starts with a score of 0. The pair of dice are then
 * thrown three times. For every double thrown, the player scores 1 point. At the end of the
 * game the total score is displayed.
 *
 * @author Dominik Harmim harmim6@gmail.com
 */
public class DieGame2
{
	public static void main(String[] args)
	{
		// initialization
		Die die1 = new Die(6), die2 = new Die(6);
		int score = 0;

		// prints start message
		System.out.println("Starting Doubles ...\n");

		// prints table header
		System.out.printf("%-10s %-10s\n%-10s %-10s\n", "die1", "die2", "*****", "*****");

		// dices throwing
		for (int i = 0; i < 3; i++) {
			die1.throwDie();
			die2.throwDie();
			int die1FaceValue = die1.getFaceValue(),
				die2FaceValue = die2.getFaceValue();

			if (die1FaceValue == die2FaceValue) {
				score++;
			}

			// prints faces
			System.out.printf("%-10d %-10d\n", die1FaceValue, die2FaceValue);
		}

		// prints final score
		System.out.printf("\nYour score = %d.\n", score);
	}
}
