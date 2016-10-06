package ua.com.mi.epam.ajp_1;

/**
 * @author West
 *
 */
public class Accountant {
	public static void main(String[] args) {

		Programmer man1 = new Programmer(4000, 172);
		Manager man2 = new Manager(2800, 172);

		Employee[] empls = { man1, man2 };
		System.out.println(calculateSalary(empls));
		// man1.print();
		// man2.print();
	}

	public static float calculateSalary(Employee[] employee) {
		float sum = 0f;
		for (Employee e : employee) {
			sum += e.countSalary();
		}
		return sum;
	}
}
