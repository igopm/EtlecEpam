package ua.com.mi.epam.etlec_3;

import ua.com.mi.kostin.Kostin;

public class Square extends Figure {
	private double x;
	private double y;

	private double side;

	public Square() {
		super();
	}

	public Square(double x, double y, double side) {
		super();
		this.x = x;
		this.y = y;
		this.side = side;
	}

	@Override
	public void move() {
		this.x = Kostin.random(-99, 99);
		this.y = Kostin.random(-99, 99);
	}

	@Override
	public void scale(int scale) {
		this.side = side * scale;
	}

	@Override
	public String toString() {
		return "Square - centr ( " + x + "; " + y
				+ "), sides [AB = BC = AC = BC = " + side + "]";
	}
}
