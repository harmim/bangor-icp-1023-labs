package Bank4;


/**
 * A bank account has a balance that can be changed by deposits and withdrawals.
 *
 * @author Dominik Harmim harmim6@gmail.com
 */
public abstract class BankAccount
{
	private double balance;


	/**
	 * Constructs a bank account with a zero balance.
	 */
	public BankAccount()
	{
		balance = 0;
	}


	/**
	 * Constructs a bank account with a given balance.
	 *
	 * @param initialBalance the initial balance
	 */
	public BankAccount(double initialBalance)
	{
		balance = initialBalance;
	}


	public abstract void endOfMonth();


	/**
	 * Deposits money into the bank account.
	 *
	 * @param amount the amount to deposit
	 */
	public void deposit(double amount)
	{
		balance += amount;
	}


	/**
	 * Withdraws money from the bank account.
	 *
	 * @param amount the amount to withdraw
	 */
	public void withdraw(double amount)
	{
		balance -= amount;
	}


	/**
	 * Gets the current balance of the bank account.
	 *
	 * @return the current balance
	 */
	public double getBalance()
	{
		return balance;
	}


	/**
	 * Transfers from this to other account.
	 *
	 * @param amount sum to be transferred
	 * @param other recipient of transfer
	 */
	public void transfer(double amount, BankAccount other)
	{
		withdraw(amount);
		other.deposit(amount);
	}


	/**
	 * Returns string representation of BankAccount.
	 *
	 * @return string representation of BankAccount
	 */
	@Override
	public String toString()
	{
		return "BankAccount["
			+ "balance=" + balance
			+ "]";
	}
}
