package javaNewAgg;

public class Employee {
	int id;
	String name;
	//HAS -A relationship
	Address address;
	String contact;
	
	public Employee(int id, String name, Address address, String contact) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.contact = contact;
	}
	
	
	public void displayDetails() {
		System.out.println(id + " "+name +" "+address.buildingName + " "+contact);

   }

}
	

