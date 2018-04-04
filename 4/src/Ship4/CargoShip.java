package Ship4;


/**
 * @author Dominik Harmim harmim6@gmail.com
 */
public class CargoShip extends Ship
{
	private double capacity;


	public CargoShip(String name, int yearOfBuilt, double capacity)
	{
		super(name, yearOfBuilt);
		this.capacity = capacity;
	}


	public double getCapacity()
	{
		return capacity;
	}


	@Override
	public String toString()
	{
		return super.toString()
			+ "{"
			+ "capacity=" + capacity
			+ "}";
	}
}
