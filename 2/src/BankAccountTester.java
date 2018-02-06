/**
 * A class to test the BankAccount class.
 *
 * @author Dominik Harmim harmim6@gmail.com
 */
public class BankAccountTester
{
	public static void main(String[] args)
	{
		BankAccount jacksAccount = new BankAccount("734089427");
		BankAccount jillsAccount = new BankAccount(500.0, "321321312");

		System.out.println("Jack's and Jill's accounts at the begining:");
		System.out.println("Jack's account: " + jacksAccount);
		System.out.println("Jill's account: " + jillsAccount);

		jacksAccount.deposit(200.0);
		jillsAccount.withdraw(200.0);
		jacksAccount.withdraw(500.0);

		System.out.println("\nJack's and Jill's accounts after some deposits and withdraws:");
		System.out.println("Jack's account: " + jacksAccount);
		System.out.println("Jill's account: " + jillsAccount);
	}
}
