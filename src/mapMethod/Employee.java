package mapMethod;

import java.util.List;

public class Employee {

	private int id;
	private String name;
	private String email;
	private int salary;
	private List<String> phoneNo;


	public Employee(int id, String name, String email, int salary, List<String> list) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.salary = salary;
		this.phoneNo = list;
	}
	public Employee() {
		super();

		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;


	}



	public List<String> getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(List<String> phoneNo) {
		this.phoneNo = phoneNo;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", email=" + email + ", salary=" + salary + ", phoneNo="
				+ phoneNo + "]";
	}






}
