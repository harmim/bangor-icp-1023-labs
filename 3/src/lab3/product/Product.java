package lab3.product;


/**
 * @author Dominik Harmim harmim6@gmail.com
 */
public class Product
{
	private String description;
	private double price;


	public Product(String description, double price)
	{
		this.description = description;
		this.price = price;
	}


	public String getDescription()
	{
		return description;
	}


	public double getPrice()
	{
		return price;
	}


	public void reducePrice(double percentage)
	{
		price -= percentage / 100 * price;
	}


	public void increasePrice(double percentage)
	{
		price += percentage / 100 * price;
	}


	public String format()
	{
		return String.format("%-20s %-10.2f", description, price);
	}


	@Override
	public String toString()
	{
		return "Product{" +
			"description='" + description + "'" +
			", price=" + price +
			"}";
	}
}
