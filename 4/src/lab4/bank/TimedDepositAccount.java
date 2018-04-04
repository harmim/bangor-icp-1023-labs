package lab4.bank;


/**
 * @author Dominik Harmim harmim6@gmail.com
 */
public class TimedDepositAccount extends BankAccount
{
	private static final double penalty = 20.0;


	private double interest;
	private int numberOfMonths;


	public TimedDepositAccount()
	{
		interest = 10;
		numberOfMonths = 3;
	}


	public TimedDepositAccount(double initialBalance)
	{
		super(initialBalance);
		interest = 10;
		numberOfMonths = 3;
	}


	@Override
	public void withdraw(double amount)
	{
		if (numberOfMonths > 0) {
			amount += penalty;
		}
		super.withdraw(amount);
	}


	public void endOfMonth()
	{
		deposit(getBalance() * interest / 100);
		numberOfMonths--;
	}


	@Override
	public String toString()
	{
		return super.toString()
			+ "["
			+ "interest=" + interest
			+ ", numberOfMonths=" + numberOfMonths
			+ "]";
	}
}
