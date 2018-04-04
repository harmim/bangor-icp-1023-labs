package lab4.worker;


/**
 * @author Dominik Harmim harmim6@gmail.com
 */
public class HourlyWorker extends Worker
{
	public HourlyWorker(String name, double hourlyPayRate)
	{
		super(name, hourlyPayRate);
	}


	public double computePay(int hours)
	{
		return hours * getHourlyPayRate();
	}
}
