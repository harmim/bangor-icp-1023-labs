package lab8.student;


/**
 * Student class tester.
 *
 * @author Dominik Harmim harmim6@gmail.com
 */
public class StudentTester
{
	public static void main(String[] args)
	{
		System.out.println("New Student:");
		Student student = new Student("Matt", "Smith", "100256UG", "B.A. History");
		System.out.println("Forename: " + student.getForename());
		System.out.println("Surname: " + student.getSurname());
		System.out.println("Student ID: " + student.getStudentId());
		System.out.println("Degree scheme: " + student.getDegreeScheme());

		System.out.println("\nChange Student properties:");
		student.setForename("Dominik");
		student.setSurname("Harmim");
		student.setStudentId("666656UG");
		student.setDegreeScheme("B.Sc. Computer Science");
		System.out.println("Forename: " + student.getForename());
		System.out.println("Surname: " + student.getSurname());
		System.out.println("Student ID: " + student.getStudentId());
		System.out.println("Degree scheme: " + student.getDegreeScheme());

		System.out.println("\nTest format method:");
		System.out.println(student.format());

		System.out.println("\nTest toString method:");
		System.out.println(student);


		System.out.println("\nCreate another student:");
		Student student2 = new Student("John", "O'Conner", "200256UG", "B.A. History");
		System.out.println(student2);


		System.out.println("\nCreate one more student:");
		Student student3 = new Student("Jeff", "Seid", "300256UG", "B.Sc. Computer Science");
		System.out.println(student3);
	}
}
