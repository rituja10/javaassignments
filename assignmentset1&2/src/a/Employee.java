package a;

public class Employee {
	private int id;
	private String firstName;
	private String lastName;
	private int salary;
	
	public Employee(int id, String firstName, String lastName, int salary) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}


	public String getFirstName() {
		return firstName;
	}

	//calculate full name and return 
	public String getName() {
		return firstName+" "+ lastName;
	}
	
	public String getLastName() {
		return lastName;
	}

	public int getSalary() {
		return salary;
	}
	
	//calculate annual salary and return 
	public int getAnnualSalary() {
		return salary*12;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	//increase the salary by the percentage and return the new salary
	public void raiseSalary(int percentage) {
		this.salary= this.salary*(100+percentage)/100;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", salary=" + salary
				+ "]";
	}
}
