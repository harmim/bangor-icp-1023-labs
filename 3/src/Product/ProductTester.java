package Product;


/**
 * @author Dominik Harmim harmim6@gmail.com
 */
public class ProductTester
{
	public static void main(String[] args)
	{
		Product product = new Product("Notebook", 300.0);
		System.out.println("New product");
		System.out.println("Description: " + product.getDescription());
		System.out.println("Price: " + product.getPrice());

		System.out.println("\nReduce price by 50%");
		product.reducePrice(50.0);
		System.out.println("Price: " + product.getPrice());

		System.out.println("\nIncrase price by 90%");
		product.increasePrice(90.0);
		System.out.println("Price: " + product.getPrice());

		System.out.println("\nTest format method");
		System.out.println(product.format());

		System.out.println("\nTest toString method");
		System.out.println(product);
	}
}
