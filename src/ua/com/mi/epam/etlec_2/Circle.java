package ua.com.mi.epam.etlec_2;

import ua.com.mi.kostin.Kostin;

public class Circle {
	private double x;
	private double y;
	private double radius;

	public double getX() {
		return x;
	}

	public void setX(double newX) {
		this.x = newX;
	}

	public double getY() {
		return y;

	}

	public void setY(double newY) {
		this.y = newY;

	}

	public double getRadius() {
		return radius;

	}

	public void setRadius(double newRadius) {
		this.radius = newRadius;

	}

	public Circle() {

	}

	public Circle(double x, double y, double radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;
	}

	// 1
	public void move(double dx, double dy) {
		x = x + dx;
		y = y + dy;
	}

	public boolean pointCircle(float pointX, float pointY) {
		if (Math.sqrt((Math.pow((pointX - getX()), 2) + Math.pow(
				(pointY - getY()), 2))) <= Math.pow(getRadius(), 2)) {
			return true;
		} else
			return false;
	}

	public double length() {
		return 2 * Math.PI * radius;
	}

	public void moveRndom() {
		this.x = Kostin.random(-99, 99);
		this.y = Kostin.random(-99, 99);
	}

	public double square() {
		return Math.PI * radius * radius;
	}

	public String toString() {
		return "Окружность с центром (" + x + "; " + y + ") и радиусом "
				+ radius;
	}

	public void print() {
		System.out.println(this);
	}

}
