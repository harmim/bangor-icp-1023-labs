package Student;


/**
 * @author Dominik Harmim harmim6@gmail.com
 */
public class Student
{
	private String forename;
	private String surname;
	private String identifier;
	private String degreeCourse;


	public Student(String forename, String surname, String identifier, String degreeCourse)
	{
		this.forename = forename;
		this.surname = surname;
		this.identifier = identifier;
		this.degreeCourse = degreeCourse;
	}


	public String getForename()
	{
		return forename;
	}


	public void setForename(String forename)
	{
		this.forename = forename;
	}


	public String getSurname()
	{
		return surname;
	}


	public void setSurname(String surname)
	{
		this.surname = surname;
	}


	public String getIdentifier()
	{
		return identifier;
	}


	public void setIdentifier(String identifier)
	{
		this.identifier = identifier;
	}


	public String getDegreeCourse()
	{
		return degreeCourse;
	}


	public void setDegreeCourse(String degreeCourse)
	{
		this.degreeCourse = degreeCourse;
	}


	public String format()
	{
		return String.format("%-10s %-10s %-10s %-20s", forename, surname, identifier, degreeCourse);
	}


	@Override
	public String toString()
	{
		return "Student{" +
			"forename='" + forename + "'" +
			", surname='" + surname + "'" +
			", identifier='" + identifier + "'" +
			", degreeCourse='" + degreeCourse + "'" +
			"}";
	}
}
