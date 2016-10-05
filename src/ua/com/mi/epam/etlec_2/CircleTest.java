package ua.com.mi.epam.etlec_2;

public class CircleTest {
	public static void main(String[] args) {
		System.out.println("c1");
		Circle c1 = new Circle(4, 2, 1);
		c1.print();
		c1.pointCircle(3, 2);
		c1.move(10, -45);
		c1.print();
		System.out.println("c2");
		Circle c2 = new Circle(10, 10, 3);
		c2.print();
		c2.moveRndom();
		c2.print();

	}
}
