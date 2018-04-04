package lab6.dataset;


import java.awt.Rectangle;


/**
 * @author Dominik Harmim harmim6@gmail.com
 */
public class RectanglePerimeterMeasurer implements Measurer
{
	@Override
	public double measure(Object object)
	{
		Rectangle rectangle = (Rectangle) object;
		return 2 * (rectangle.getWidth() + rectangle.getHeight());
	}
}
