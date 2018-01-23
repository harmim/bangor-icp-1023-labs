import java.util.Scanner;


public class GradeCalculatorWithMethods
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		System.out.println("ICP 1023 Grade Calculator");
		System.out.println("*************************");
		double testsPercentage = getTests(input);
		double labsPercentage = getLabs(input);
		double assignmentPercentage = getAssignment(input);
		int finalMark = calculateMark(testsPercentage, labsPercentage, assignmentPercentage);
		displayMark(finalMark);
	}


	private static double getTests(Scanner input)
	{
		System.out.println("Enter test marks");
		int testsSum = 0;
		for (int i = 1; i < 5; i++) {
			System.out.printf("Test %d: ", i);
			testsSum += input.nextInt();
		}

		return (double) testsSum / (20 * 4) * 100;
	}


	private static double getLabs(Scanner input)
	{
		System.out.println("Enter laboratory marks");
		int labsSum = 0;
		for (int i = 1; i < 5; i++) {
			System.out.printf("Lab %d: ", i);
			labsSum += input.nextInt();
		}

		return (double) labsSum / (10 * 4) * 100;
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
