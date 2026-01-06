package oops_pillars;
import java.util.*;

interface Department {
	void assignDepartment(String dept);

	void getDepartmentDetails();
}

abstract class Employee {

	private int employeeId;
	private String name;
	private int baseSalary;

	public Employee(int employeeId, String name, int baseSalary) {
		this.employeeId = employeeId;
		this.name = name;
		this.baseSalary = baseSalary;
	}

	// Getters 
	public int getEmployeeId() {
		return employeeId;
	}

	public String getName() {
		return name;
	}

	public int getBaseSalary() {
		return baseSalary;
	}

	// Abstract method
	abstract double calculateSalary();

	// Concrete method display details
	void displayDetails() {
		System.out.println("Employee ID    : " + employeeId);
		System.out.println("Employee Name  : " + name);
		System.out.println("Final Salary   : " + calculateSalary());
	}
}

// FullTimeEmployee subclass
class FullTimeEmployee extends Employee implements Department {

	private String department;

	public FullTimeEmployee(int employeeId, String name, int baseSalary) {
		super(employeeId, name, baseSalary);
	}

	double calculateSalary() {
		return getBaseSalary(); // Fixed salary
	}

	public void assignDepartment(String dept) {
		this.department = dept;
	}

	public void getDepartmentDetails() {
		System.out.println("Department     : " + department);
	}

	void displayDetails() {
		System.out.println("--- Full Time Employee ---");
		super.displayDetails();
		getDepartmentDetails();
	}
}

// PartTimeEmployee subclass
class PartTimeEmployee extends Employee implements Department {

	private int hoursWorked;
	private int ratePerHour;
	private String department;

	public PartTimeEmployee(int employeeId, String name, int hoursWorked, int ratePerHour) {
		super(employeeId, name, 0); // baseSalary not used
		this.hoursWorked = hoursWorked;
		this.ratePerHour = ratePerHour;
	}

	double calculateSalary() {
		return hoursWorked * ratePerHour;
	}

	public void assignDepartment(String dept) {
		this.department = dept;
	}

	public void getDepartmentDetails() {
		System.out.println("Department     : " + department);
	}

	void displayDetails() {
		System.out.println("\n--- Part Time Employee ---");
		super.displayDetails();
		getDepartmentDetails();
	}
}

// Main class
public class EmployeeManagement {
	public static void main(String[] args) {
		
		List<Employee> emp = new ArrayList<>();
		
		Employee e1 = new FullTimeEmployee(1, "Aryan Chaturvedi", 40000);
		Employee e2 = new PartTimeEmployee(2, "Pankaj Bharadwaj", 6, 500);

		((Department) e1).assignDepartment("IT");
		((Department) e2).assignDepartment("HR");

		
		// Polymorphism thorugh not using List
		// e1.displayDetails();
		// e2.displayDetails();
		
		emp.add(e1);
		emp.add(e2);
		
		//Polymorphism through List
		for (Employee em : emp) {
            em.displayDetails();
        }
	}
}