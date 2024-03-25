package model;

public class Employee {

	private int id;  
	private String name;  
	private Address address;
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public Employee(int id, String name, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}
	public Address getAddress() {
		return address;
	}
	
	public void show(){  
	    System.out.println(id+" "+name);  
	    System.out.println(address.toString());  
	}  
	  
	
	
	
}
