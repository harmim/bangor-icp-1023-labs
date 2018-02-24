package Dice;


import java.util.Random;


/**
 * Simulation the behaviour of a standard six-faced die.
 *
 * @author Dominik Harmim harmim6@gmail.com
 */
public class Die
{
	/**
	 * Current face value of die.
	 */
	private int faceValue;

	/**
	 * Number of sides.
	 */
	private int sides;

	/**
	 * Random generator instance.
	 */
	private Random generator;


	/**
	 * Creates and initializes new die.
	 *
	 * @param sides number of sides
	 */
	public Die(int sides)
	{
		generator = new Random();
		this.sides = sides;
		throwDie();
	}


	/**
	 * Simulation the action of throwing the die.
	 */
	public void throwDie()
	{
		faceValue = generator.nextInt(sides) + 1;
	}


	/**
	 * Returns current face value.
	 *
	 * @return current face value
	 */
	public int getFaceValue()
	{
		return faceValue;
	}


	/**
	 * Returns string representation of die.
	 *
	 * @return string representation of die
	 */
	@Override
	public String toString()
	{
		return "Die["
			+ "faceValue=" + faceValue
			+ ", sides=" + sides
			+ "]";
	}
}
