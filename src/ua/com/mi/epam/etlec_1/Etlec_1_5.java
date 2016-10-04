package ua.com.mi.epam.etlec_1;

public class Etlec_1_5 {
	public static int calculateLuckyTickets(int start, int end) {

		int count = 0;
		for (int six = start; six < end; six++) {
			int lsiz = six / 1000;
			int rsiz = six % 1000;
			if (Etlec_1_2.sum(lsiz) == Etlec_1_2.sum(rsiz)) {
				count++;
			}
		}
		return count;

	}

	public static void main(String[] args) {
		/*
		 * Подсчитать, сколько шестизначных цифр имеют равную сумму трех первых
		 * и трех последних цифр.
		 */
		System.out.println(calculateLuckyTickets(111111, 999999));
	}
}
