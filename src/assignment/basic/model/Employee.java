package assignment.basic.model;

public class Employee {
	int empid;
	String name;
	int age;
	int salary;
	
	
	
	
	
	public Employee(int empid, String name, int age, int salary) {
		super();
		this.empid = empid;
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	public int getempid() {
		return empid;
	}
	public void setempid(int empid) {
		this.empid = empid;
	}
	public String getname() {
		return name;
	}
	public void setname(String name) {
		this.name = name;
	}
	public int getage() {
		return age;
	}
	public void setage(int age) {
		this.age = age;
	}
	public int getsalary() {
		return salary;
	}
	public void setsalary(int salary) {
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "\ntoStringcalled\t"+name+"\t"+age+"\t"+salary;
	}
	
}
