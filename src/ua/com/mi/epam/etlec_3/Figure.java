package ua.com.mi.epam.etlec_3;

/**
 * @author West
 *
 */
public abstract class Figure {

	public void print() {
		System.out.println(this);
	};

	public abstract void move();

	public abstract void scale(int scale);
}
