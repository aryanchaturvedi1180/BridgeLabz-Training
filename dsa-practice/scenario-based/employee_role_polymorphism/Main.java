package scenario.employee_role_polymorphism;

public class Main {
	public static void main(String[] args) {
		
		 Employee manager = new Manager("Aryan", 80000);
	     System.out.printf("%.2f%n", manager.getBonus());

	     Employee dev1 = new Developer("Pankaj", 60000);
	     System.out.printf("%.2f%n", dev1.getBonus());

	     Employee dev2 = new Developer("Kanha", 40000);
	     System.out.printf("%.2f%n", dev2.getBonus());
	}

}
