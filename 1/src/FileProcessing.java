import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class FileProcessing
{
	public static void main(String[] args) throws IOException
	{
		System.out.println("ICP 1023 Grade Calculator");
		System.out.println("*************************");

		try (BufferedReader br = new BufferedReader(new FileReader("marks.dat"))) {
			while (true) {
				String line = br.readLine();
				if (line == null) {
					break;
				}

				String[] values = line.split(", ");
				double testsPercentage = getTests(values);
				double labsPercentage = getLabs(values);
				double assignmentPercentage = getAssignment(values);
				int finalMark = calculateMark(testsPercentage, labsPercentage, assignmentPercentage);
				displayMark(finalMark);
			}
		}
	}


	private static double getTests(String[] values)
	{
		int testsSum = 0;
		for (int i = 0; i < 4; i++) {
			testsSum += Integer.parseInt(values[i]);
		}

		return (double) testsSum / (20 * 4) * 100;
	}


	private static double getLabs(String[] values)
	{
		int labsSum = 0;
		for (int i = 4; i < 8; i++) {
			labsSum += Integer.parseInt(values[i]);
		}

		return (double) labsSum / (10 * 4) * 100;
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
}
