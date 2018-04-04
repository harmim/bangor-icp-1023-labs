package DataSet6;


/**
 * @author Dominik Harmim harmim6@gmail.com
 */
public class BankAccountFilter implements Filter
{
	@Override
	public boolean accept(Object object)
	{
		return ((BankAccount) object).getBalance() >= 1000;
	}
}
