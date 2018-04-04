package Circle3;


/**
 * @author Dominik Harmim harmim6@gmail.com
 */
public class Circle
{
	private double radius;


	public Circle()
	{
		radius = 0.0;
	}


	public Circle(double radius)
	{
		this.radius = radius;
	}


	public double getRadius()
	{
		return radius;
	}


	public double calcArea()
	{
		return Math.PI * Math.pow(radius, 2);
	}


	public double calcDiameter()
	{
		return radius * 2;
	}


	public double calcCircumference()
	{
		return 2 * Math.PI * radius;
	}


	@Override
	public String toString()
	{
		return "Circle{" +
			"radius=" + radius +
			"}";
	}
}
