package ua.com.mi.epam.ajp_1;

/**
 * @author West
 *
 */
public class Manager extends Employee {
	public Manager() {

	}

	public Manager(float salary, float workingHours) {
		super(salary, workingHours);
	}

	public float countSalary() {
		return (workingHours >= AvG_WORKING_HOURS) ? salary
				: ((salary / AvG_WORKING_HOURS) * workingHours);
	}

	public String toString() {
		return "Менеджер\n" + super.toString() + countSalary() + " грн.\n";
	}
}
