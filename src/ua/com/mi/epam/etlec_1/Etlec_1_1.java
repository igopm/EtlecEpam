package ua.com.mi.epam.etlec_1;

/**
 * @author West
 *
 */

public class Etlec_1_1 {
	public static int nSd(int a, int b) {

		while (a != b) {
			if (a > b) {
				a = a - b;
			} else
				b = b - a;

		}
		return a;
	}

	public static void main(String[] args) {
		/*
		 * Написать программу, которая находит наибольший общий делитель двух
		 * целых положительных чисел.
		 */
		System.out.println(nSd(110, 150));
	}
}
