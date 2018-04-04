package lab3.circle;


/**
 * @author Dominik Harmim harmim6@gmail.com
 */
public class CircleTester
{
	public static void main(String[] args)
	{
		Circle circle0 = new Circle();
		System.out.println("New Circle with radius 0");
		System.out.println("Radius: " + circle0.getRadius());

		Circle circle = new Circle(5.0);
		System.out.println("\nNew Circle with radius 5");
		System.out.println("Radius: " + circle.getRadius());
		System.out.println("Diameter: " + circle.calcDiameter());
		System.out.println("Circumference: " + circle.calcCircumference());
		System.out.println("Area: " + circle.calcArea());

		System.out.println("\nTest toString method");
		System.out.println(circle);
	}
}
