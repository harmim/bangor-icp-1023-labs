/**
 * @author Dominik Harmim harmim6@gmail.com
 */
public class Person
{
	private String forename;
	private String surname;
	private int age;
	private double height;
	private String gender;

	private static int personCount;


	/**
	 * Creates new Person with initial attributes.
	 *
	 * @param forename person surename
	 * @param surname  person forename
	 * @param age      person age
	 * @param height   person height in meters
	 * @param gender   person gender, normally male or female
	 */
	public Person(String forename, String surname, int age, double height, String gender)
	{
		this.forename = forename;
		this.surname = surname;
		this.age = age;
		this.height = height;
		this.gender = gender;

		personCount++;
	}


	/**
	 * Returns person forename.
	 *
	 * @return person forename
	 */
	public String getForename()
	{
		return forename;
	}


	/**
	 * Sets person forename.
	 *
	 * @param forename person forename
	 */
	public void setForename(String forename)
	{
		this.forename = forename;
	}


	/**
	 * Returns person surename.
	 *
	 * @return person surename
	 */
	public String getSurname()
	{
		return surname;
	}


	/**
	 * Sets person surename.
	 *
	 * @param surname person surename
	 */
	public void setSurname(String surname)
	{
		this.surname = surname;
	}


	/**
	 * Returns person age.
	 *
	 * @return person age
	 */
	public int getAge()
	{
		return age;
	}


	/**
	 * Sets person age.
	 *
	 * @param age person age
	 */
	public void setAge(int age)
	{
		this.age = age;
	}


	/**
	 * Returns person height.
	 *
	 * @return person height in meters
	 */
	public double getHeight()
	{
		return height;
	}


	/**
	 * Set person height.
	 *
	 * @param height person height in meters
	 */
	public void setHeight(double height)
	{
		this.height = height;
	}


	/**
	 * Returns person gender.
	 *
	 * @return person gender, normally male or female
	 */
	public String getGender()
	{
		return gender;
	}


	/**
	 * Sets person gener.
	 *
	 * @param gender person gender, normally male or female
	 */
	public void setGender(String gender)
	{
		this.gender = gender;
	}


	/**
	 * Returns count of created persons.
	 *
	 * @return count of created persons
	 */
	public static int getPersonCount()
	{
		return personCount;
	}


	/**
	 * Returns formated string representation of Person instance.
	 *
	 * @return formated string representation of Person instance
	 */
	public String format()
	{
		return String.format("%-10s %-10s %-10d %-10.2f %-10s", forename, surname, age, height, gender);
	}


	/**
	 * Returns string represetation of Person instance.
	 *
	 * @return string represetation of Person instance
	 */
	@Override
	public String toString()
	{
		return "Person[" +
			"forename=" + forename +
			", surname=" + surname +
			", age=" + age +
			", height=" + height +
			", gender=" + gender +
			"]";
	}
}
