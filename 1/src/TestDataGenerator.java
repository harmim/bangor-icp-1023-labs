import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;


/**
 * @author Dominik Harmim <harmim6@gmail.com>
 */
public class TestDataGenerator
{
	public static void main(String[] args)
	{
		try {
			PrintWriter writer = new PrintWriter("marks.dat", "UTF-8");
			int max;
			StringBuilder line = new StringBuilder();
			Random rand = new Random();

			for (int i = 0; i < 10; i++) {
				line.delete(0, line.length());

				for (int j = 0; j < 9; j++) {
					if (j < 4) {
						max = 10;
					} else if (j < 8) {
						max = 20;
					} else {
						max = 100;
					}

					line.append(rand.nextInt(max) + 1);
					if (j != 8) {
						line.append(", ");
					}
				}

				writer.println(line);
			}

			writer.close();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
}
