package Dice5;


import java.util.Scanner;


/**
 * Pig game, two-player die game.
 *
 * @author Dominik Harmim harmim6@gmail.com
 */
public class DieGamePig
{
	public static void main(String[] args)
	{
		// initialization
		Die die = new Die(6);
		int maxPoints = 100;
		Player player1 = new Player(0), player2 = new Player(0);

		// prints start message
		System.out.println("Starting Pig game ...\n");

		// dices throwing
		int playerNumber = 1;
		Scanner input = new Scanner(System.in);
		boolean endOfGame = false;
		while (!endOfGame) {
			for (playerNumber = 1; playerNumber <= 2; playerNumber++) {
				Player currentPlayer = playerNumber == 1 ? player1 : player2;
				System.out.printf("---------------------\nPlayer %d is throwing.\n", playerNumber);

				int score = 0;
				boolean endOfThrowing = false;
				while (!endOfThrowing) {
					die.throwDie();
					int faceValue = die.getFaceValue();
					System.out.printf("\n%d have been thrown.\n", faceValue);
					score += faceValue;

					if (faceValue == 1) {
						break;
					}

					while (true) {
						System.out.print("Do you want throw again? y/n: ");
						String decision = input.next();
						if (decision.equalsIgnoreCase("y")) {
							break;
						}

						if (decision.equalsIgnoreCase("n")) {
							currentPlayer.setScore(score);
							endOfThrowing = true;
							break;
						}
					}
				}

				// prints score
				int currentScore = currentPlayer.getScore();
				System.out.printf("\nPlayer's %d score: %d.\n\n", playerNumber, currentScore);

				if (currentScore >= maxPoints) {
					endOfGame = true;
					break;
				}
			}
		}

		// prints final score
		System.out.printf("Player %d wins!\n", playerNumber);
	}
}
