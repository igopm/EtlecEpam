package ua.com.mi.epam.etlec;

public class Etlec_1_6 {
	public static void metodFibbonachchi(int number) {
		int arr[] = new int[number];
		arr[0] = 1;
		arr[1] = 1;
		System.out.print(arr[0] + " " + arr[1] + " ");
		for (int i = 2; i < arr.length; i++) {
			arr[i] = arr[i - 1] + arr[i - 2];
			System.out.print(arr[i] + " ");
		}
	}

	public static void main(String[] args) {
		
//		  ���������� � ������ ������ �� 20 ��������� � ��������� ��� �����
//		  ����������: 1, 1, 2, 3, 5, 8, 13, 21, � � ���� ���� ������ ���������
//		 ����� �������� ������ ���� ����������.
		 
		int arr[] = new int[20];
		arr[0] = 1;
		arr[1] = 1;

		System.out.print(arr[0] + " " + arr[1] + " ");

		for (int i = 2; i < arr.length; i++) {
			arr[i] = arr[i - 1] + arr[i - 2];
			System.out.print(arr[i] + " ");
		}
	}
}
