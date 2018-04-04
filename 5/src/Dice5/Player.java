package Dice5;


/**
 * Class representing player with score.
 *
 * @author Dominik Harmim harmim6@gmail.com
 */
public class Player
{
	/**
	 * Player's score.
	 */
	private int score;


	/**
	 * Creates player with initial score.
	 *
	 * @param score initial score
	 */
	public Player(int score)
	{
		this.score = score;
	}


	/**
	 * Increases player's score.
	 *
	 * @param points number of points which will be added to current score
	 */
	public void setScore(int points)
	{
		score += points;
	}


	/**
	 * Returns value of player's score.
	 *
	 * @return value of player's score
	 */
	public int getScore()
	{
		return score;
	}
}
