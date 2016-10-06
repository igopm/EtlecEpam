package ua.com.mi.epam.etlec_3;

/**
 * @author West
 *
 */
public class Circle extends Figure {
	private double x;
	private double y;
	private double radius;

	public Circle() {

	}

	public Circle(double x, double y, double radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;
	}

	public String toString() {
		return "Circle - center (" + x + "; " + y + "), radius [" + radius
				+ "]";
	}

	@Override
	public void move() {
		this.x = random(-99, 99);
		this.y = random(-99, 99);
	}

	@Override
	public void scale(int scale) {
		this.radius = radius * scale;
	}

}
