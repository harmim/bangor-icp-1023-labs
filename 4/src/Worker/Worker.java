package Worker;


/**
 * @author Dominik Harmim harmim6@gmail.com
 */
public abstract class Worker
{
	private String name;
	private double hourlyPayRate;


	public Worker(String name, double hourlyPayRate)
	{
		this.name = name;
		this.hourlyPayRate = hourlyPayRate;
	}


	public String getName()
	{
		return name;
	}


	public void setName(String name)
	{
		this.name = name;
	}


	public double getHourlyPayRate()
	{
		return hourlyPayRate;
	}


	public void setHourlyPayRate(double hourlyPayRate)
	{
		this.hourlyPayRate = hourlyPayRate;
	}


	@Override
	public String toString()
	{
		return "Worker{" +
			"name=" + name +
			", hourlyPayRate=" + hourlyPayRate +
			"}";
	}
}
