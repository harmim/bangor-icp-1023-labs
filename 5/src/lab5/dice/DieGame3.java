package lab5.dice;


/**
 * Like DieGame2 but for two players.
 *
 * @author Dominik Harmim harmim6@gmail.com
 */
public class DieGame3
{
	public static void main(String[] args)
	{
		// initialization
		Die die1 = new Die(6), die2 = new Die(6);
		Player player1 = new Player(0), player2 = new Player(0);

		// prints start message
		System.out.println("Starting Doubles ...\n");

		// dices throwing
		for (int playerNumber = 1; playerNumber <= 2; playerNumber++) {
			Player currentPlayer = playerNumber == 1 ? player1 : player2;

			// prints table header
			System.out.printf("%-10s %-10s\n%-10s %-10s\n", "die1", "die2", "*****", "*****");

			for (int i = 0; i < 3; i++) {
				die1.throwDie();
				die2.throwDie();
				int die1FaceValue = die1.getFaceValue(),
					die2FaceValue = die2.getFaceValue();

				if (die1FaceValue == die2FaceValue) {
					currentPlayer.setScore(1);
				}

				// prints faces
				System.out.printf("%-10d %-10d\n", die1FaceValue, die2FaceValue);
			}

			// prints score
			System.out.printf("\nPlayer %d: score = %d.\n\n", playerNumber, currentPlayer.getScore());
		}

		// prints final score
		int player1Score = player1.getScore(),
			player2Score = player2.getScore();
		if (player1Score == player2Score) {
			System.out.println("Draw!");
		} else {
			System.out.printf("Player %d wins!\n", player1Score > player2Score ? 1 : 2);
		}
	}
}
