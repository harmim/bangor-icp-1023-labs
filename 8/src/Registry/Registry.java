package Registry;


import Student.Student;

import java.util.LinkedList;
import java.util.ListIterator;


/**
 * Registry of students.
 *
 * @author Dominik Harmim harmim6@gmail.com
 */
public class Registry
{
	/**
	 * List of students.
	 */
	private LinkedList<Student> studentList;


	/**
	 * Creates registry of students.
	 */
	public Registry()
	{
		studentList = new LinkedList<>();
	}


	/**
	 * Adds student to registry.
	 *
	 * @param student student to be added
	 */
	public void addStudent(Student student)
	{
		studentList.addLast(student);
	}


	/**
	 * Deletes student from registry.
	 *
	 * @param studentId student ID of student to be deleted
	 */
	public void deleteStudent(String studentId)
	{
		ListIterator<Student> iterator = studentList.listIterator();
		while (iterator.hasNext()) {
			Student student = iterator.next();
			if (studentId.equals(student.getStudentId())) {
				iterator.remove();
				break;
			}
		}
	}


	/**
	 * Returns registry of students as formatted string.
	 *
	 * @return registry of students as formatted string
	 */
	public String format()
	{
		StringBuilder stringBuilder = new StringBuilder(
			String.format("%-10s %-15s %-15s %-20s\n", "Forename", "Surname", "Student ID", "Degree scheme")
			+ String.format("%010d %015d %015d %020d\n", 0, 0, 0, 0).replace('0', '-')
		);
		String prefix = "";
		for (Student student : studentList) {
			stringBuilder.append(prefix);
			prefix = "\n";
			stringBuilder.append(student.format());
		}

		return stringBuilder.toString();
	}


	/**
	 * Returns string representation of registry of students.
	 *
	 * @return string representation of registry of students
	 */
	@Override
	public String toString()
	{
		StringBuilder stringBuilder = new StringBuilder();
		String prefix = "";
		for (Student student : studentList) {
			stringBuilder.append(prefix);
			prefix = "\n";
			stringBuilder.append(student.toString());
		}

		return stringBuilder.toString();
	}
}
