package Worker4;


/**
 * @author Dominik Harmim harmim6@gmail.com
 */
public class SalariedWorker extends Worker
{
	public SalariedWorker(String name, double hourlyPayRate)
	{
		super(name, hourlyPayRate);
	}


	public double computePay()
	{
		return 40 * getHourlyPayRate();
	}
}
