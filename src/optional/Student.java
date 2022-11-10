package optional;

public class Student {
	
	

	private int rollNo;
	private String name;
	private String email;
	private String phoneNo;
	private String course;
	
	
	
	
	
	public Student(int rollNo, String name, String email, String phoneNo, String course) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.email = email;
		this.phoneNo = phoneNo;
		this.course = course;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return rollNo;
	}
	public void setId(int id) {
		this.rollNo = rollNo;
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
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	@Override
	public String toString() {
		return "Student [id=" + rollNo + ", name=" + name + ", email=" + email + ", phoneNo=" + phoneNo + ", course="
				+ course + "]";
	}
	
	
	
	
	
	
	

}
