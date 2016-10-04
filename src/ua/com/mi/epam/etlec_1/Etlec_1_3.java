package ua.com.mi.epam.etlec_1;

public class Etlec_1_3 {
	/*
	 * �������� ��������� �������� ����, ��� �������� ����� � � ������� (�.�. ��
	 * ������� ��� ������� �� �� ����� �����, ����� ���� � 1). ����� X ��������
	 * � ���� ���������.
	 */

	public static boolean isSimple(int value) {
		boolean result = true;
		for (int i = value / 2; i > 1; i--) {
			if (value % i == 0) {
				result = false;
				break;
			}
		}
		return result;
	}

	public static void main(String[] args) {
		int a = 1;
		int b = a++;
		int c = -a;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
}
