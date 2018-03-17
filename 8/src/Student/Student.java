package Student;


/**
 * Class that represents Student.
 *
 * @author Dominik Harmim harmim6@gmail.com
 */
public class Student
{
	/**
	 * Student's forename.
	 */
	private String forename;

	/**
	 * Student's surname.
	 */
	private String surname;

	/**
	 * Student's ID.
	 */
	private String studentId;

	/**
	 * Student's degree scheme.
	 */
	private String degreeScheme;


	/**
	 * Creates student with given properties.
	 *
	 * @param forename student's forename
	 * @param surname student's surname
	 * @param studentId student's ID
	 * @param degreeScheme student's degree scheme
	 */
	public Student(String forename, String surname, String studentId, String degreeScheme)
	{
		this.forename = forename;
		this.surname = surname;
		this.studentId = studentId;
		this.degreeScheme = degreeScheme;
	}


	/**
	 * Returns student's forename.
	 *
	 * @return student's forename
	 */
	public String getForename()
	{
		return forename;
	}


	/**
	 * Sets student's forename.
	 *
	 * @param forename student's forename
	 */
	public void setForename(String forename)
	{
		this.forename = forename;
	}


	/**
	 * Returns student's surname.
	 *
	 * @return student's surname
	 */
	public String getSurname()
	{
		return surname;
	}


	/**
	 * Sets student's surname.
	 *
	 * @param surname student's surname
	 */
	public void setSurname(String surname)
	{
		this.surname = surname;
	}


	/**
	 * Returns student's ID.
	 *
	 * @return student's ID
	 */
	public String getStudentId()
	{
		return studentId;
	}


	/**
	 * Sets student's ID.
	 *
	 * @param studentId student's ID
	 */
	public void setStudentId(String studentId)
	{
		this.studentId = studentId;
	}


	/**
	 * Returns student's degree scheme.
	 *
	 * @return student's degree scheme
	 */
	public String getDegreeScheme()
	{
		return degreeScheme;
	}


	/**
	 * Sets student's degree scheme.
	 *
	 * @param degreeScheme student's degree scheme
	 */
	public void setDegreeScheme(String degreeScheme)
	{
		this.degreeScheme = degreeScheme;
	}


	/**
	 * Returns student as formatted string.
	 *
	 * @return student as formatted string
	 */
	public String format()
	{
		return String.format("%-10s %-15s %-15s %-20s", forename, surname, studentId, degreeScheme);
	}


	/**
	 * Returns string representation of Student class.
	 *
	 * @return string representation of Student class
	 */
	@Override
	public String toString()
	{
		return "Student{"
			+ "forename=" + forename
			+ ", surname=" + surname
			+ ", studentId=" + studentId
			+ ", degreeScheme=" + degreeScheme
			+ "}";
	}
}
