package ua.com.mi.epam.etlec_3;

import ua.com.mi.kostin.Kostin;

/**
 * @author West
 *
 */
public class Circle extends Figure {
	private double x;
	private double y;
	private double radius;

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public Circle() {

	}

	public Circle(double x, double y, double radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;
	}

	public String toString() {
		return "Circle - center (" + x + "; " + y + "), radius [" + radius + "]";
	}

	@Override
	public void move() {
		this.x = Kostin.random(-99, 99);
		this.y = Kostin.random(-99, 99);
	}

	@Override
	public void scale(int scale) {
		this.radius = radius * scale;

	}
}
