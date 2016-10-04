package ua.com.mi.epam.etlec_1;

public class Etlec_1_10 {
	/*
	 * Создать "треугольный" массив из 10 строк и заполнить его
	 * биномиальными коэффициентами (треугольник Паскаля)
	 */
	public static void main(String[] args) {
	int n = 10;
	int arr[][] = new int[n][];

	for (int i = 1; i <= n; i++) {
		arr[i - 1] = new int[i];
	}

	for (int i = 0; i < n; i++) {
		for (int t = 0; t < i + 1; t++) {
			if (t == 0 || t == (i)) {
				arr[i][t] = 1;
			} else {
				arr[i][t] = arr[i - 1][t - 1] + arr[i - 1][t];
			}
		}
	}

	for (int w = 0; w < n; w++) {
		for (int f = 0; f < w + 1; f++) {
			System.out.print(arr[w][f] + " ");
		}
		System.out.println();
	}
}
}
