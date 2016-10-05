package ua.com.mi.epam.etlec_2;

public class MatrixTest {
	
	public static void main(String[] args) {
		Matrix matrixA = new Matrix(3);
		Matrix matrixB = new Matrix();
		matrixA.fillRandom();

		// matrixA.multiplication(2);
		matrixA.print();
		matrixA.transposition();
		matrixA.print();

	}
}
