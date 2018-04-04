package lab6.dataset;


import java.util.Scanner;


/**
 * DoubleDataSet tester class.
 *
 * @author Dominik Harmim harmim6@gmail.com
 */
public class DoubleDataSetTester
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		DoubleDataSet doubleDataSet = new DoubleDataSet();

		while (true) {
			System.out.print("Enter value, Q quits: ");
			String value = input.next();

			if (value.equalsIgnoreCase("Q")) {
				break;
			}

			doubleDataSet.add(Double.parseDouble(value));
			System.out.println("Maximum = " + doubleDataSet.getMaximum());
			System.out.println("Minimum = " + doubleDataSet.getMinimum());
			System.out.println("Average = " + doubleDataSet.getAverage());
			System.out.println();
		}
	}
}
