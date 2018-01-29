/**
 * @author Dominik Harmim <harmim6@gmail.com>
 */
public class PersonTester
{
	public static void main(String[] args)
	{
		Person person1 = new Person("Janna", "Levin", 36, 1.75, "female");
		Person person2 = new Person("Julie", "Bowen", 28, 1.73, "female");
		Person person3 = new Person("Sarah", "Harding", 18, 1.68, "female");
		Person person4 = new Person("Matt", "Donovan", 30, 1.80, "male");
		Person person5 = new Person("Katie", "Hopkins", 29, 1.74, "female");

		System.out.println("Person 1:");
		System.out.println("Forename: " + person1.getForename());
		System.out.println("Surename: " + person1.getSurname());
		System.out.println("Age: " + person1.getAge());
		System.out.println("Height: " + person1.getHeight());
		System.out.println("Gender: " + person1.getGender());

		System.out.println("\nPerson 1 (changed attributes):");
		person1.setForename("Dominik");
		person1.setSurname("Harmim");
		person1.setAge(20);
		person1.setHeight(1.83);
		person1.setGender("male");
		System.out.println("Forename: " + person1.getForename());
		System.out.println("Surename: " + person1.getSurname());
		System.out.println("Age: " + person1.getAge());
		System.out.println("Height: " + person1.getHeight());
		System.out.println("Gender: " + person1.getGender());

		System.out.println("\ntoString() test of person 1:");
		System.out.println(person1);

		System.out.println("\nAll 5 persons:");
		System.out.println(person1.format());
		System.out.println(person2.format());
		System.out.println(person3.format());
		System.out.println(person4.format());
		System.out.println(person5.format());
		System.out.println("Person count: " + Person.getPersonCount());
	}
}
