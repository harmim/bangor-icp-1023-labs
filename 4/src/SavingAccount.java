/**
 * @author Dominik Harmim harmim6@gmail.com
 */
public class SavingAccount extends BankAccount
{
	private double interest;
	private double minBalance;


	/**
	 * Constructs a savings account with a zero balance.
	 */
	public SavingAccount()
	{
		interest = 10;
		minBalance = 0;
	}


	/**
	 * Constructs a bank account with a given balance.
	 *
	 * @param initialBalance the initial balance
	 */
	public SavingAccount(double initialBalance)
	{
		super(initialBalance);
		interest = 10;
		minBalance = 0;
	}


	@Override
	public void withdraw(double amount)
	{
		super.withdraw(amount);
		double balance = getBalance();
		if (balance < minBalance) {
			minBalance = balance;
		}
	}


	/**
	 * Adds interest to the bank account.
	 */
	public void endOfMonth()
	{
		deposit(minBalance * interest / 100);
		minBalance = getBalance();
	}


	@Override
	public String toString()
	{
		return super.toString()
			+ "["
			+ "interest="
			+ interest
			+ ", minBalance="
			+ minBalance
			+ "]";
	}
}
