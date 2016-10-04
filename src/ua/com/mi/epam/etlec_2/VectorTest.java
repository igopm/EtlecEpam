package ua.com.mi.epam.etlec_2;

public class VectorTest {
	public static void print(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void main(String[] args) {

		Vector<Integer> v1 = new Vector<Integer>();
		v1.add(1);
		v1.add(2);
		v1.add(3);
		v1.add(4);
		v1.add(5);
		v1.add(6);
		v1.print();
		v1.add(2, 5);
		v1.print();

	}
}
