package Bank;


/**
 * @author Dominik Harmim harmim6@gmail.com
 */
public class SavingsAccountTester
{
	public static void main(String[] args)
	{
		SavingAccount account = new SavingAccount();
		System.out.println("New SavingAccount with zero balance:");
		System.out.println("Balance: " + account.getBalance());
		System.out.println(account);

		SavingAccount account1 = new SavingAccount(1000.0);
		System.out.println("\nNew SavingAccount1 with initial 1000 balance:");
		System.out.println("Balance: " + account1.getBalance());
		System.out.println(account1);

		account1.withdraw(500.0);
		System.out.println("Widthdraw 500");
		System.out.println(account1);

		account1.deposit(1000.0);
		System.out.println("Deposit 1000");
		System.out.println(account1);

		account1.endOfMonth();
		System.out.println("Add interest");
		System.out.println(account1);

		account1.withdraw(200.0);
		System.out.println("Widthdraw 200");
		System.out.println(account1);

		account1.deposit(200.0);
		System.out.println("Deposit 200");
		System.out.println(account1);

		account1.endOfMonth();
		System.out.println("Add interest");
		System.out.println(account1);

		account1.transfer(500.0, account);
		System.out.println("\nTransfer 500 from SavingAccount1 to SavingAccount");
		System.out.println("SavingAccount: " + account);
		System.out.println("SavingAccount1: " + account1);
	}
}
