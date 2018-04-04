package Ship4;


/**
 * @author Dominik Harmim harmim6@gmail.com
 */
public class Ship
{
	private String name;
	private int yearOfBuilt;


	public Ship(String name, int yearOfBuilt)
	{
		this.name = name;
		this.yearOfBuilt = yearOfBuilt;
	}


	public String getName()
	{
		return name;
	}


	public int getYearOfBuilt()
	{
		return yearOfBuilt;
	}


	@Override
	public String toString()
	{
		return "Ship{" +
			"name=" + name +
			", yearOfBuilt=" + yearOfBuilt +
			'}';
	}
}
