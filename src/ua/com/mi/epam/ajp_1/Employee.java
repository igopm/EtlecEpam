package ua.com.mi.epam.ajp_1;

/**
 * @author West
 *
 */
public abstract class Employee {

	protected static final int AvG_WORKING_HOURS = 172;

	protected float salary;// зарплата
	protected float workingHours;// робочий час

	public float getSalary() {
		return salary;
	}

	public void setSalary(float newSalary) {
		this.salary = newSalary;
	}

	public float getWorkingHours() {
		return workingHours;
	}

	public void setWorkingHours(float newWorkingHours) {
		this.workingHours = newWorkingHours;
	}

	public Employee() {

	}

	public Employee(float salary, float workingHours) {
		this.salary = salary;
		this.workingHours = workingHours;
	}

	// rate тариф
	public double rate() {
		return salary / AvG_WORKING_HOURS;
	}

	public double percent() {
		return workingHours / AvG_WORKING_HOURS * 100;

	}

	public abstract float countSalary();

	public String toString() {
		return "Оклад: " + salary + " грн/мес.\nПрцент отработаных часов: "
				+ percent() + " %\nРабочих часов в месяце 172"
				+ "\nЗарплата за месяц: ";
	}

	public void print() {
		System.out.println(this);
	}

}
