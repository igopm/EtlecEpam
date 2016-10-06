package ua.com.mi.epam.ajp_1;

/**
 * @author West
 *
 */
public class Programmer extends Employee {

	public Programmer() {

	}

	public Programmer(float salary, float workingHours) {
		super(salary, workingHours);
	}

	public float countSalary() {
		return (float) (rate() * workingHours);
	}

	public String toString() {
		return "Programmer\n" + super.toString() + countSalary() + " $.\n";
	}

}
