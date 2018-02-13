package Ship;


/**
 * @author Dominik Harmim harmim6@gmail.com
 */
public class CruiseShip extends Ship
{
	private int maxNumberOfPassengers;


	public CruiseShip(String name, int yearOfBuilt, int maxNumberOfPassengers)
	{
		super(name, yearOfBuilt);
		this.maxNumberOfPassengers = maxNumberOfPassengers;
	}


	public int getMaxNumberOfPassengers()
	{
		return maxNumberOfPassengers;
	}


	@Override
	public String toString()
	{
		return super.toString()
			+ "{"
			+ "maxNumberOfPassengers=" + maxNumberOfPassengers
			+ "}";
	}
}
