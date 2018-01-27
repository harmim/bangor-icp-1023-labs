import java.util.Scanner;


/**
 * @author Dominik Harmim <harmim6@gmail.com>
 */
public class GradeCalculator
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		System.out.println("ICP 1023 Grade Calculator");
		System.out.println("*************************");

		System.out.println("Enter test marks");
		int numberOfTests = 4, testMaxPoints = 20, testsSum = 0;
		for (int i = 1; i <= numberOfTests; i++) {
			System.out.printf("Test %d: ", i);
			testsSum += input.nextInt();
		}
		double testsPercentage = (double) testsSum / (testMaxPoints * numberOfTests) * 100;

		System.out.println("Enter laboratory marks");
		int numberOfLabs = 4, labMaxPoints = 10, labsSum = 0;
		for (int i = 1; i <= numberOfLabs; i++) {
			System.out.printf("Lab %d: ", i);
			labsSum += input.nextInt();
		}
		double labsPercentage = (double) labsSum / (labMaxPoints * numberOfLabs) * 100;

		System.out.println("Programming Assignment");
		System.out.print("Assignment: ");
		double assignmentPercentage = (double) input.nextInt();

		int finalMark = (int) (testsPercentage * 0.4 + labsPercentage * 0.3 + assignmentPercentage * 0.3);

		System.out.printf("\nFinal mark is %d%%\n", finalMark);
	}
}
