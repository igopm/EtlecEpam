package ua.com.mi.epam.etlec_3;

/**
 * @author West
 *
 */
public abstract class Figure {

	public static int random(int start, int end) {
		int random = start + (int) (Math.random() * ((end - start) + 1));
		return random;
	}

	public void print() {
		System.out.println(this);
	};

	public abstract void move();

	public abstract void scale(int scale);
}
