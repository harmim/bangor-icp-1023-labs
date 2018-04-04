package lab2.counter;


/**
 * @author Dominik Harmim harmim6@gmail.com
 */
public class Counter
{
	private int value;


	public Counter()
	{
		reset();
	}


	public int getValue()
	{
		return value;
	}


	public void count()
	{
		value++;
	}


	public void reset()
	{
		value = 0;
	}


	public void decrement()
	{
		if (value > 0) {
			value--;
		}
	}
}
