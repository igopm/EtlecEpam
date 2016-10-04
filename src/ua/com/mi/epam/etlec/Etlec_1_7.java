package ua.com.mi.epam.etlec;

public class Etlec_1_7 {
	public static void main(String[] args) {
		/*
		 * —оздать целый массив из 100 элементов и заполнить его простыми
		 * числами: 2, 3, 5, 7, 11, 13, 17, Е
		 */
		int arr[] = new int[100];

		for (int i = 0, number = 1; i < 100; number++) {

			if (Etlec_1_3.isSimple(number)) {
				arr[i] = number;

				System.out.print(arr[i] + " ");
				i++;
			}

		}

	}
}
