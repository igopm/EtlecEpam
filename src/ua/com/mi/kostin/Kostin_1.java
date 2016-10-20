package ua.com.mi.kostin;

import java.util.Scanner;

public class Kostin_1 {
	public static void main(String[] args) {
		// http://kostin.ws/java/java-hello.html
		// DZ = 1
		System.out.println(20 * (1 / 3) + Math.pow(158, 2));

		// DZ = 2
		byte a = 14;
		System.out.println(a / 2019 + a * (29 - Math.pow(13, 2) + a / 3));

		// DZ = 3
		int n = 29;
		int a3 = n / 10;
		int b = n % 10;
		System.out.println(a3 + b);

		// DZ = 4
		double n4 = 156.78;
		System.out.println(Math.round(n4));

		// DZ = 5
		Scanner scanner = new Scanner(System.in);
		System.out.println("please enter number");
		int n5 = scanner.nextInt();
		int a5 = n5 / 10;
		int b5 = n5 % 10;
		int c5 = a5 / 10;
		int d5 = a5 % 10;
		System.out.print("sum ");
		System.out.println(d5 + b5 + c5);
		scanner.close();
	}
}
