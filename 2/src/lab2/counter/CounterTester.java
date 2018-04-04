package lab2.counter;


/**
 * @author Dominik Harmim harmim6@gmail.com
 */
public class CounterTester
{
	public static void main(String[] args)
	{
		System.out.println("Testing Counter Class");
		System.out.println("*********************");

		Counter counter = new Counter();

		System.out.println("Count up");
		for (int i = 0; i <= 4; i++) {
			System.out.printf("Counter value: %d\n", counter.getValue());
			counter.count();
		}

		System.out.println("\nReset");
		counter.reset();

		System.out.println("\nCount up");
		for (int i = 0; i <= 4; i++) {
			System.out.printf("Counter value: %d\n", counter.getValue());
			counter.count();
		}

		System.out.println("\nCount down");
		for (int i = 0; i <= 4; i++) {
			counter.decrement();
			System.out.printf("Counter value: %d\n", counter.getValue());
		}
	}
}
