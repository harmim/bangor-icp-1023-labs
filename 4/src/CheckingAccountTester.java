/**
 * @author Dominik Harmim harmim6@gmail.com
 */
public class CheckingAccountTester
{
	public static void main(String[] args)
	{
		CheckingAccount account = new CheckingAccount();
		System.out.println("New CheckingAccount with zero balance:");
		System.out.println("Balance: " + account.getBalance());
		System.out.println(account);

		CheckingAccount account1 = new CheckingAccount(1000.0);
		System.out.println("\nNew CheckingAccount1 with initial 1000 balance:");
		System.out.println("Balance: " + account1.getBalance());
		System.out.println(account1);

		account1.endOfMonth();
		System.out.println("Deduct fees without transactions");
		System.out.println(account1);

		account1.withdraw(500.0);
		System.out.println("Widthdraw 500");
		System.out.println(account1);

		account1.deposit(1000.0);
		System.out.println("Deposit 1000");
		System.out.println(account1);

		account1.deposit(2000.0);
		System.out.println("Deposit 2000");
		System.out.println(account1);

		account1.withdraw(500.0);
		System.out.println("Widthdraw 500");
		System.out.println(account1);

		account1.withdraw(500.0);
		System.out.println("Widthdraw 500");
		System.out.println(account1);

		account1.endOfMonth();
		System.out.println("Deduct fees after 5 transactions");
		System.out.println(account1);

		account1.transfer(500.0, account);
		System.out.println("\nTransfer 500 from CheckingAccount1 to CheckingAccount");
		System.out.println("CheckingAccount: " + account);
		System.out.println("CheckingAccount1: " + account1);
	}
}
