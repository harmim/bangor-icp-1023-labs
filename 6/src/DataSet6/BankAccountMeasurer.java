package DataSet6;


/**
 * @author Dominik Harmim harmim6@gmail.com
 */
public class BankAccountMeasurer implements Measurer
{
	@Override
	public double measure(Object object)
	{
		return ((BankAccount) object).getBalance();
	}
}
