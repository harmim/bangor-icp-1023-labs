package lab8.registry;


import lab8.student.Student;

import java.util.InputMismatchException;
import java.util.Scanner;


/**
 * Command line interface that allow the user to interact with the registry.
 *
 * @author Dominik Harmim harmim6@gmail.com
 */
public class RegistryCli
{
	/**
	 * Menu options labels.
	 */
	private static final String[] MENU_OPTIONS = {
		"Add a Student",
		"Delete a Student",
		"Print Registry",
		"Quit",
	};


	/**
	 * Registry of students.
	 */
	private Registry registry;

	/**
	 * Java utils Scanner instance for input.
	 */
	private Scanner input;


	/**
	 * Creates and initializes registry CLI.
	 *
	 * @param registry initial students registry
	 */
	public RegistryCli(Registry registry)
	{
		this.registry = registry;
		input = new Scanner(System.in);
	}


	/**
	 * Runs registry CLI interface.
	 * Displays menu and processing user actions until an error will occur or user want to quit.
	 */
	public void run()
	{
		do {
			displayMenu();
		} while (processUserAction());
	}


	/**
	 * Displays menu.
	 */
	private void displayMenu()
	{
		System.out.println("\nRegistry Main Menu");
		System.out.println("******************\n");

		for (int i = 0; i < MENU_OPTIONS.length; i++) {
			System.out.printf("%d. %s\n", i + 1, MENU_OPTIONS[i]);
		}
		System.out.printf("\nSelect option (1-%d) :> ", MENU_OPTIONS.length);
	}


	/**
	 * Processes user action. (Reads users input and generate appropriate output.)
	 *
	 * @return false in case of user wants quit, true otherwise
	 */
	private boolean processUserAction()
	{
		int option;
		try {
			option = input.nextInt();
		} catch (InputMismatchException e) {
			input.nextLine();
			System.out.println(e.toString());
			return true;
		}

		System.out.println();

		switch (option) {
			case 1:
				addStudent();
				break;

			case 2:
				deleteStudent();
				break;

			case 3:
				printRegistry();
				break;

			case 4:
				return false;

			default:
				System.out.println("Unknown option.");
		}

		return true;
	}


	/**
	 * Performs student addition operation.
	 */
	private void addStudent()
	{
		System.out.println(MENU_OPTIONS[0]);
		System.out.println("******************\n");

		boolean add = true;
		do {
			System.out.print("Enter forename :> ");
			String forename = input.next();
			System.out.print("Enter surname :> ");
			String surname = input.next();
			System.out.print("Enter student ID :> ");
			String studentId = input.next();
			input.nextLine();
			System.out.print("Enter degree scheme :> ");
			String degreeScheme = input.nextLine();

			registry.addStudent(new Student(forename, surname, studentId, degreeScheme));

			System.out.println();
			while (true) {
				System.out.print("Add another (Y/N) :> ");
				String decision = input.next();
				if (decision.equalsIgnoreCase("N")) {
					add = false;
					break;

				} else if (decision.equalsIgnoreCase("Y")) {
					break;
				}
			}
		} while (add);
	}


	/**
	 * Performs student deletion operation.
	 */
	private void deleteStudent()
	{
		System.out.println(MENU_OPTIONS[1]);
		System.out.println("******************\n");

		boolean delete = true;
		do {
			System.out.print("Enter student ID :> ");
			registry.deleteStudent(input.next());

			System.out.println();
			while (true) {
				System.out.print("Delete another (Y/N) :> ");
				String decision = input.next();
				if (decision.equalsIgnoreCase("N")) {
					delete = false;
					break;

				} else if (decision.equalsIgnoreCase("Y")) {
					break;
				}
			}
		} while (delete);
	}


	/**
	 * Prints student registry.
	 */
	private void printRegistry()
	{
		System.out.println(MENU_OPTIONS[2]);
		System.out.println("******************\n");

		System.out.println(registry.format());
	}
}
