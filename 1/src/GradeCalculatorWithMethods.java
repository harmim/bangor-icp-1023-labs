import java.util.Scanner;


/**
 * @author Dominik Harmim harmim6@gmail.com
 */
public class GradeCalculatorWithMethods
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		System.out.println("ICP 1023 Grade Calculator");
		System.out.println("*************************");
		displayMark(calculateMark(getTests(input), getLabs(input), getAssignment(input)));
	}


	private static double getTests(Scanner input)
	{
		int numberOfTests = 4, testMaxPoints = 20, testsSum = 0;
		for (int i = 1; i <= numberOfTests; i++) {
			System.out.printf("Test %d: ", i);
			testsSum += input.nextInt();
		}

		return (double) testsSum / (testMaxPoints * numberOfTests) * 100;
	}


	private static double getLabs(Scanner input)
	{
		System.out.println("Enter laboratory marks");
		int numberOfLabs = 4, labMaxPoints = 10, labsSum = 0;
		for (int i = 1; i <= numberOfLabs; i++) {
			System.out.printf("Lab %d: ", i);
			labsSum += input.nextInt();
		}

		return (double) labsSum / (labMaxPoints * numberOfLabs) * 100;
	}


	private static double getAssignment(Scanner input)
	{
		System.out.println("Programming Assignment");
		System.out.print("Assignment: ");

		return (double) input.nextInt();
	}


	private static int calculateMark(double testsPercentage, double labsPercentage, double assignmentPercentage)
	{
		return (int) (testsPercentage * 0.4 + labsPercentage * 0.3 + assignmentPercentage * 0.3);
	}


	private static void displayMark(int finalMark)
	{
		System.out.printf("\nFinal mark is %d%%\n", finalMark);
	}
}
