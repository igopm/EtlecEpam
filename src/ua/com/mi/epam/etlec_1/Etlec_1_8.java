package ua.com.mi.epam.etlec_1;

public class Etlec_1_8 {
	public static void main(String[] args) { 
		/*������� ��������� ������ �������� � ��������� ��� ������� '�' � '�' � ��������� �������.*/
				char[][] arr = new char[10][10];
				for (int i = 0; i < arr.length; i++) {
					for (int a = 0; a < arr[i].length; a++) {
						if ((i + a) % 2 == 0) {
							arr[i][a] = '�';
						} else {
							arr[i][a] = '�';
						}
						System.out.print(arr[i][a]+" ");
					}
					System.out.println();
				}
				
			}
}
