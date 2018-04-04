package DataSet6;


/**
 * A bank account has a balance that can be changed by deposits and withdrawals.
 *
 * @author Dominik Harmim harmim6@gmail.com
 */
public class BankAccount implements Measurable
{
	private double balance;


	/**
	 * Constructs a bank account with a zero balance.
	 */
	public BankAccount()
	{
		balance = 0.0;
	}


	/**
	 * Constructs a bank account with a given balance.
	 *
	 * @param initialBalance initial balance
	 */
	public BankAccount(double initialBalance)
	{
		balance = initialBalance;
	}


	/**
	 * Deposits money into the bank account.
	 *
	 * @param amount amount to deposit
	 */
	public void deposit(double amount)
	{
		balance += amount;
	}


	/**
	 * Withdraws money from the bank account.
	 *
	 * @param amount amount to withdraw
	 */
	public void withdraw(double amount)
	{
		balance -= amount;
	}


	/**
	 * Gets the current balance of the bank account.
	 *
	 * @return current balance
	 */
	public double getBalance()
	{
		return balance;
	}


	/**
	 * {@inheritDoc}
	 */
	@Override
	public double getMeasure()
	{
		return balance;
	}


	/**
	 * Returns string representation of Bank Account.
	 *
	 * @return string representation of Bank Account
	 */
	@Override
	public String toString()
	{
		return "BankAccount[" +
			"balance = " + balance +
			"]";
	}
}
