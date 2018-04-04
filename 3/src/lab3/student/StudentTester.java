package lab3.student;


/**
 * @author Dominik Harmim harmim6@gmail.com
 */
public class StudentTester
{
	public static void main(String[] args)
	{
		Student student = new Student("Matt", "Smith", "100256UG", "B.A. History");
		System.out.println("New Student");
		System.out.println("Forename: " + student.getForename());
		System.out.println("Surname: " + student.getSurname());
		System.out.println("Identifier: " + student.getIdentifier());
		System.out.println("DegreeCourse: " + student.getDegreeCourse());

		student.setForename("Dominik");
		student.setSurname("Harmim");
		student.setIdentifier("666656UG");
		student.setDegreeCourse("B.Sc. Computer Science");
		System.out.println("\nChange Student properties");
		System.out.println("Forename: " + student.getForename());
		System.out.println("Surname: " + student.getSurname());
		System.out.println("Identifier: " + student.getIdentifier());
		System.out.println("DegreeCourse: " + student.getDegreeCourse());

		System.out.println("\nTest format method");
		System.out.println(student.format());

		System.out.println("\nTest toString method");
		System.out.println(student);
	}
}
