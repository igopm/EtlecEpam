package ua.com.mi.kostin;

public class Kostin {
	
	public static int random(int start, int end) {
		int random = start + (int) (Math.random() * ((end - start) + 1));
		return random;
	}
}
