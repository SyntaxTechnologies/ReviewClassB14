package review2;

public class Teacher {
	
	String name, lastName;
	int experience;
	String subject;
	double salary;
	
	static String school;
	
	/* how to create a constructor
	 *  1. constructor name=classname
	 *  2. no return type not even void
	 */

	//using below constructor we initialize instance variables (name, lName)
	Teacher(String fName, String lName){
		name=fName;
		lastName=lName;
	}
	
	/*
	 * when you create a constructor 
	 * COMPILEer is NOT going to create a default constructor for you
	 */
	
	void print() {
		System.out.println(name+" "+lastName);
	}
}
