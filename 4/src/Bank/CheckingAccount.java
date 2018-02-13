package Bank;


/**
 * @author Dominik Harmim harmim6@gmail.com
 */
public class CheckingAccount extends BankAccount
{
	/**
	 * Number of free transactions.
	 */
	private static final int FREE_TRANSACTIONS = 3;

	/**
	 * Fee per transaction.
	 */
	private static final double TRANSACTION_FEE = 2.0;


	/**
	 * Counts number of transactions on the checking account.
	 */
	private int transactionCount;


	/**
	 * Creates a new instance of CheckingAccount.
	 */
	public CheckingAccount()
	{
		transactionCount = 0;
	}


	/**
	 * Creates a new instance of CheckingAccount.
	 *
	 * @param initialAmount initial deposit for the new account
	 */
	public CheckingAccount(double initialAmount)
	{
		super(initialAmount);
		transactionCount = 0;
	}


	@Override
	public void deposit(double amount)
	{
		transactionCount++;
		super.deposit(amount);
	}


	@Override
	public void withdraw(double amount)
	{
		transactionCount++;
		super.withdraw(amount);
	}


	/**
	 * Method to calculate fees and deduct this amount from the balance
	 * transactionCount is reset to 0 to start counting new transactions.
	 */
	public void endOfMonth()
	{
		if (transactionCount > FREE_TRANSACTIONS) {
			super.withdraw(TRANSACTION_FEE * (transactionCount - FREE_TRANSACTIONS));
		}
		transactionCount = 0;
	}


	@Override
	public String toString()
	{
		return super.toString()
			+ "["
			+ "transactionCount=" + transactionCount
			+ "]";
	}
}
