package ua.com.mi.epam.etlec_2;

public class Vector<F> {
	private static final int DEFAULT_LENGTH = 12;
	private int count;
	private F[] arr;

	public Vector() {
		arr = (F[]) new Object[DEFAULT_LENGTH];
		count = 0;
	}

	private void increase() {
		F[] arr1 = (F[]) new Object[arr.length + DEFAULT_LENGTH];
		for (int i = 0; i < arr.length; i++) {
			arr1[i] = arr[i];
		}
		arr = arr1;
	}

	public void add(F numberElement) {
		arr[count++] = numberElement;
		if (count == arr.length - 1) {
			increase();

		}
	}

	public void add(int index, F element) throws IncorrectIndexException {
		if (index > arr.length || index < 0) {
			throw new IncorrectIndexException("неверный индекс!!!");
		}
		F[] temp = (F[]) new Object[arr.length * 2];
		for (int i = 0; i < arr.length; i++) {
			if (i < index) {
				temp[i] = (F) arr[i];
			} else {
				temp[i + 1] = (F) arr[i];

			}

		}
		temp[index] = (F) element;
		count++;
		this.arr = temp;
	}

	public void cleanAll() {
		count = 0;
	}

	public F getElement(int index) {
		if (index < 0 || index > count) {
			IndexOutOfBoundsException e = new IndexOutOfBoundsException(
					"Vector cent retorn...");
			throw e;

		}

		return arr[index];

	}

	public void delElement(int indx) {

		for (; indx < count - 1; indx++) {
			arr[indx] = arr[indx + 1];
		}
		count--;
	}

	@Override
	public String toString() {
		String reselt = "";
		for (int i = 0; i < count; i++)
			reselt += arr[i] + " ";
		return reselt;
	}

	public void print() {
		System.out.println("Значения массива:\n" + this.toString());
	}

}