package ua.com.mi.kostin;

/**
 * @author West
 *
 */
public class Kostin_2 {
	public static void main(String[] args) {
		// http://kostin.ws/java/java-types-and-variables.html
		// Dz = 1
		int q = 21;
		int w = 8;
		int a = q / w;
		int b = q % w;
		System.out.println("21/8 равно " + a + " и " + b + " в остатке.");

		// Dz = 2
		int a2 = 29;
		int s2 = a2 / 10;
		int d2 = a2 % 10;
		System.out.println(s2 + d2);

		// Dz = 3
		double w3 = 457.145;
		System.out.println(Math.round(w3));

		// Dz = 4
		int n4 = 111;
		int a4 = n4 / 10;
		int b4 = n4 % 10;
		int c4 = a4 / 10;
		int d4 = a4 % 10;
		System.out.println(d4 + b4 + c4);

	}
}
