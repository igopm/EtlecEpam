package ua.com.mi.epam.etlec_3;

public class FigureTest {
	public static void main(String[] args) {
		Figure a = new Circle(5, 3, 5);
		a.print();
		a.scale(4);
		a.move();
		a.print();

		Figure b = new Rectangle(4, 5, 2, 5);
		b.print();
		b.scale(4);
		b.move();
		b.print();

		Figure c = new Square(3, 2, 10);
		c.print();
		c.scale(4);
		c.move();
		c.print();
	}
}