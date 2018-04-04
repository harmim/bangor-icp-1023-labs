package lab4.bank;


/**
 * @author Dominik Harmim harmim6@gmail.com
 */
public class TimedDepositAccountTester
{
	public static void main(String[] args)
	{
		TimedDepositAccount account = new TimedDepositAccount();
		System.out.println("New TimedDepositAccount with zero balance:");
		System.out.println("Balance: " + account.getBalance());
		System.out.println(account);

		TimedDepositAccount account1 = new TimedDepositAccount(1000.0);
		System.out.println("\nNew TimedDepositAccount1 with initial 1000 balance:");
		System.out.println("Balance: " + account1.getBalance());
		System.out.println(account1);

		account1.endOfMonth();
		System.out.println("Add interest");
		System.out.println(account1);

		account1.withdraw(500.0);
		System.out.println("Withdraw 500");
		System.out.println(account1);

		account1.deposit(2000.0);
		System.out.println("Deposit 2000");
		System.out.println(account1);

		account1.endOfMonth();
		System.out.println("Add interest");
		System.out.println(account1);

		account1.withdraw(200.0);
		System.out.println("Withdraw 200");
		System.out.println(account1);

		account1.endOfMonth();
		System.out.println("Add interest");
		System.out.println(account1);

		account1.withdraw(200.0);
		System.out.println("Withdraw 200");
		System.out.println(account1);

		account1.transfer(500.0, account);
		System.out.println("\nTransfer 500 from TimedDepositAccount1 to TimedDepositAccount");
		System.out.println("TimedDepositAccount: " + account);
		System.out.println("TimedDepositAccount1: " + account1);
	}
}
