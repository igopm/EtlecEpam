package ua.com.mi.epam.etlec_2;

import ua.com.mi.kostin.Kostin;

public class Matrix {
	private static final int MATRIX_NUMBER = 2;
	private int[][] matrix;

	public Matrix() {
		matrix = new int[MATRIX_NUMBER][MATRIX_NUMBER];
	}

	public Matrix(int size) {
		matrix = new int[size][size];
	}

	public void fill(int prime) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = prime;
			}
		}
	}

	public void fillRandom() {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = Kostin.random(1, 9);
			}
		}
	}

	public void plus(Matrix m) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				this.matrix[i][j] += m.matrix[i][j];
			}
		}
	}

	public void multiplication(int number) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] *= number;
			}
		}
	}

	public void transposition() {

		int[][] tMatrix = new int[matrix.length][matrix.length];

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				tMatrix[i][j] = matrix[i][j];

			}
		}
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = tMatrix[j][i];
			}
		}
	}

	public String toString() {
		String reselt = "";
		for (int i = 0; i < matrix.length; i++) {
			for (int g = 0; g < matrix[i].length; g++) {

				reselt += matrix[i][g] + " ";
			}
			reselt += "\n";
		}
		return reselt;
	}

	public void print() {
		System.out.println(this.toString());
	}
}
