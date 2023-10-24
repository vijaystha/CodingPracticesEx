package javaNewAgg;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Address address = new Address(2, "XYZ", "Camac Street", 787677);
		
		Employee employee = new Employee(1001, "Ravi", address, "90989990");
		
		employee.displayDetails();;
	}

}
