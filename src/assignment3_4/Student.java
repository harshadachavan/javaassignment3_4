package assignment3_4;

public class Student {
/**
 * Declaring all variables name,phone,rollnumber,classname as private
 * These variables will be accessible only to the methods of this class
 * any modification needs to be done using the getter and setter methods
 * defined to access these variables
 * */
	private String name;
	private String phone;
	private int rollnumber;
	private String classname;

	//getter method for name
	public String getName() {
		return this.name;
	}
	
	//getter method for phone number
	public String getPhone() {
		return this.phone;
	}
	
	//getter method for rollnumber
	public int getRollnumber() {
		return this.rollnumber;
	}
	
	//getter method for class name
	public String getClassname() {
		return  this.classname; 
	}
	
	//setter method for phone number
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	//setter method for name
	public void setName(String name) {
		this.name = name;
	}
	
	//setter method for class
	public void setClassname(String classname) {
		this.classname = classname;
	}
	
	//setter method for rollno.
	public void setRollnumber(int rollnumber) {
		this.rollnumber = rollnumber;
	}
	
	
	public void displayResult () {
			//Using Get method to retrive all data
			System.out.println("The result for this student is : ");
			System.out.println("Name : "+this.getName());
			System.out.println("Phone : "+this.getPhone());
			System.out.println("Class : "+this.getClassname());
			System.out.println("Roll No : "+this.getRollnumber());
		
		}

}
