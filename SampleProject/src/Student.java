
public class Student {

	private String name;
	private String ID;
	private String email;
	private String Course;
	
	

	public Student(String name, String iD, String email,String course) 
	{
		super();
		this.name = name;
		ID = iD;
		this.email = email;
		Course=course;
	}
	
	

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	public String getCourse() {
		return Course;
	}

	public void setCourse(String course) {
		Course = course;
	}
	

	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public void display(){
		System.out.println("Student Name: "+name);
		System.out.println("Student ID: "+ID);
		System.out.println("email: "+email);
		System.out.println("course: "+Course);
	}
}
