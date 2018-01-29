/**
 * A bank account has a balance that can be changed by deposits and withdrawals.
 *
 * @author Dominik Harmim <harmim6@gmail.com>
 */
public class BankAccount
{
	private double balance;
	private String accountNumber;


	/**
	 * Constructs a bank account with a zero balance.
	 *
	 * @param accountNumber account number
	 */
	public BankAccount(String accountNumber)
	{
		balance = 0.0;
		this.accountNumber = accountNumber;
	}


	/**
	 * Constructs a bank account with a given balance.
	 *
	 * @param initialBalance initial balance
	 * @param accountNumber  account number
	 */
	public BankAccount(double initialBalance, String accountNumber)
	{
		balance = initialBalance;
		this.accountNumber = accountNumber;
	}


	/**
	 * Deposits money into the bank account.
	 *
	 * @param amount ammount to deposit
	 */
	public void deposit(double amount)
	{
		balance += amount;
	}


	/**
	 * Withdraws money from the bank account.
	 *
	 * @param amount ammount to withdraw
	 */
	public void withdraw(double amount)
	{
		if (amount > balance) {
			balance = 0.0;
		} else {
			balance -= amount;
		}
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
	 * Returns string representation of Bank Account.
	 *
	 * @return string representation of Bank Account
	 */
	@Override
	public String toString()
	{
		return "BankAccount[" +
			"balance = " + balance +
			", accountNumber = " + accountNumber +
			"]";
	}
}
