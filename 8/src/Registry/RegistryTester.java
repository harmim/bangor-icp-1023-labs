package Registry;


import Student.Student;


/**
 * Registry class tester.
 *
 * @author Dominik Harmim harmim6@gmail.com
 */
public class RegistryTester
{
	public static void main(String[] args)
	{
		System.out.println("Creates empty registry:");
		Registry registry = new Registry();
		System.out.println("toString(): \n" + registry);


		System.out.println("\nAdd 4 students to registry:");
		registry.addStudent(new Student("Dominik", "Harmim", "666656UG", "B.Sc. Computer Science"));
		registry.addStudent(new Student("Matt", "Smith", "100256UG", "B.A. History"));
		registry.addStudent(new Student("John", "O'Conner", "200256UG", "B.A. History"));
		registry.addStudent(new Student("Jeff", "Seid", "300256UG", "B.Sc. Computer Science"));
		System.out.println("toString():\n" + registry);


		System.out.println("\nDelete student with ID 200256UG:");
		registry.deleteStudent("200256UG");
		System.out.println("toString(): \n" + registry);


		System.out.println("\nTest format method:");
		System.out.println(registry.format());
	}
}
