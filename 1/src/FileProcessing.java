import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class FileProcessing
{
	public static void main(String[] args)
	{
		System.out.println("ICP 1023 Grade Calculator");
		System.out.println("*************************");

		try (BufferedReader br = new BufferedReader(new FileReader("marks.dat"))) {
			int marksSum = 0;
			int marksCount = 0;

			while (true) {
				String line = br.readLine();
				if (line == null) {
					break;
				}

				String[] values = line.split(", ");
				if (values.length == 9) {
					int mark = calculateMark(getTests(values), getLabs(values), getAssignment(values));
					marksSum += mark;
					marksCount++;
					displayMark(mark);
				}
			}

			System.out.printf("\nMean mark is %g%%\n", calculateMean(marksSum, marksCount));
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}


	private static double getTests(String[] values)
	{
		int numberOfTests = 4, testMaxPoints = 20, testsSum = 0;
		for (int i = 0; i < numberOfTests; i++) {
			testsSum += Integer.parseInt(values[i]);
		}

		return (double) testsSum / (testMaxPoints * numberOfTests) * 100;
	}


	private static double getLabs(String[] values)
	{
		int numberOfLabs = 4, labMaxPoints = 10, labsSum = 0;
		for (int i = 4; i < numberOfLabs + 4; i++) {
			labsSum += Integer.parseInt(values[i]);
		}

		return (double) labsSum / (labMaxPoints * numberOfLabs) * 100;
	}


	private static double getAssignment(String[] values)
	{
		return (double) Integer.parseInt(values[8]);
	}


	private static int calculateMark(double testsPercentage, double labsPercentage, double assignmentPercentage)
	{
		return (int) (testsPercentage * 0.4 + labsPercentage * 0.3 + assignmentPercentage * 0.3);
	}


	private static void displayMark(int finalMark)
	{
		System.out.printf("\nFinal mark is %d%%\n", finalMark);
	}


	private static double calculateMean(int sum, int count)
	{
		return (double) sum / count;
	}
}
