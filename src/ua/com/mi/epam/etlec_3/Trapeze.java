package ua.com.mi.epam.etlec_3;

public class Trapeze extends Figure {
	private double ab;
	private double bc;
	private double cd;
	private double da;

	private double x;
	private double y;

	public Trapeze() {
		super();
	}

	public Trapeze(double x, double y, double ab, double bc, double cd) {
		super();
		this.ab = ab;
		this.bc = bc;
		this.cd = cd;
		this.da = bc;
		this.x = x;
		this.y = y;
	}

	@Override
	public void move() {
		this.x = random(-99, 99);
		this.y = random(-99, 99);
	}

	@Override
	public void scale(int scale) {
		this.ab = ab * scale;
		this.bc = bc * scale;
		this.cd = cd * scale;
		this.da = da * scale;
	}

	@Override
	public String toString() {
		return "Trapeze - centr ( " + x + "; " + y + "), sides [AB = " + ab
				+ " BC = " + bc + " CD = " + cd + " DA = " + da + "]";
	}

}
