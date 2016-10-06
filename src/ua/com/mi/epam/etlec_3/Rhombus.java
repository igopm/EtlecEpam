package ua.com.mi.epam.etlec_3;

/**
 * @author West
 *
 */
public class Rhombus extends Figure {
	private double x;
	private double y;

	private double side;

	private double angleA;
	private double angleB;
	private double angleC;
	private double angleD;

	public Rhombus() {
		super();
	}

	public Rhombus(double x, double y, double angleA, double angleB, double side) {
		super();
		this.x = x;
		this.y = y;
		this.side = side;
		this.angleA = angleA;
		this.angleB = angleB;
		this.angleC = angleA;
		this.angleD = angleB;

	}

	@Override
	public void move() {
		this.x = random(-99, 99);
		this.y = random(-99, 99);
	}

	@Override
	public void scale(int scale) {
		this.side = side * scale;

	}

	@Override
	public String toString() {
		return "Rhombus - centr ( " + x + "; " + y
				+ "), sides [AB = BC = CD = DA = " + side
				+ "], angle [ A = C = " + angleA + " deg; B = D = " + angleB
				+ " deg]";
	}

}
