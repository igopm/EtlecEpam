package ua.com.mi.epam.etlec_1;

public class Etlec_1_2 {
	/*
	 * Написать программу, которая находит сумму цифр произвольного целого
	 * числа.
	 */
	public static int sum(int number) {
		int sum = 0;
		while (number != 0) {
			int w = number % 10;
			number = number / 10;
			sum += w;
		}
		return sum;
	}

	public static void main(String[] args) {
		System.out.println(sum(1221));
	}
}
