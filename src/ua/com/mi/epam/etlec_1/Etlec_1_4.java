package ua.com.mi.epam.etlec_1;

public class Etlec_1_4 {
	/*
	 * —осчитать сумму р€да 1! - 2! + 3! Ц 4! + 5! - Е + n! дл€ заданного числа
	 * n > 0. „ем шире диапазон возможных значений n, тем лучше. „исло n
	 * задавать в коде программы
	 */
	public static int fact(int x) {
		return (x < 1) ? 1 : x * fact(x - 1);
	}

	public static int factRow(int n) {
		int result = 0;
		for (int i = 1; i <= n; i++) {
			if (i % 2 == 1) {
				result += fact(i);
			} else {
				result -= fact(i);
			}
		}
		return result;
	}

	public static void main(String[] args) {
		System.out.println(factRow(10));
	}
}
