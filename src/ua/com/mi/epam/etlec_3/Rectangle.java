package ua.com.mi.epam.etlec_3;

/**
 * @author West
 *
 */
public class Rectangle extends Figure {

	private double a;
	private double b;
	private double c;
	private double d;

	private double x;
	private double y;

	public Rectangle() {
	}

	public Rectangle(double x, double y, double a, double b) {
		super();
		this.x = x;
		this.y = y;
		this.a = a;
		this.b = b;
		this.c = a;
		this.d = b;
	}

	@Override
	public String toString() {
		return "Rectangle - centr ( " + x + "; " + y + "), sides [AB = BC = "
				+ a + "; AC = BC = " + b + "]";
	}

	@Override
	public void move() {
		this.x = random(-99, 99);
		this.y = random(-99, 99);
	}

	@Override
	public void scale(int scale) {
		this.a = a * scale;
		this.b = b * scale;
		this.c = this.a;
		this.d = this.b;

	}

}
