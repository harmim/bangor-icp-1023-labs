package Dice5;


/**
 * Die Game: Six or Lose
 *
 * This is a single player game called Six or Lose. The die is placed on the table with some
 * particular value showing on the die face. The player starts with a score of six. The player
 * then throws the die. If the face is a six then the game is over and the player still has a score
 * of six. On the other hand if the die face is not six then the player loses one point and throws
 * again. This process continues until either the player has thrown a six or the player’s score has
 * become equal to zero. The aim of the game is to throw a six before the player’s score reaches
 * zero.
 *
 * @author Dominik Harmim harmim6@gmail.com
 */
public class DieGame1
{
	public static void main(String[] args)
	{
		Die die = new Die(6); // die object creation
		int score = 6; // initial score

		// prints start message
		System.out.println("Starting Six or Lose ...\n");

		// prints table header
		System.out.printf("%-15s %-10s\n%-15s %-10s\n", "Die face", "Score", "*********", "*****");

		// die throwing
		int currentFaceValue;
		do {
			die.throwDie();
			currentFaceValue = die.getFaceValue();

			if (currentFaceValue != 6) {
				score--;
			}

			// prints die face and score
			System.out.printf("%-15d %-10d\n", currentFaceValue, score);
		} while (currentFaceValue != 6 && score > 0);

		// prints end message
		if (score > 0) {
			System.out.printf("\nYou’ve thrown a six!!! You win with a score of %d.\n", score);
		} else {
			System.out.println("\nYou've not thrown a six. You lose.");
		}
	}
}
