class Employee 
{
	int empno;
	String name;
	float sal;
	
	void setDetails(){
		name = "Sanjay Patil";
		sal = 5000.75f;
	}

	void getDetails(){
		System.out.println(empno + " | " + name + " | " + sal);
	}
	/*
	public static void main(String[] args) 
	{
		System.out.println("inside main() of Employee");
	}
	*/
} //Employee

class ObjectTest{
	public static void main(String[] args) 
	{
		//-- create an instance/object of Employee type
		Employee emp = new Employee();

		//-- access the state of an instance using reference
		System.out.println(emp.empno + " | " + emp.name + " | " + emp.sal);

		//-- access the state of an instance using reference & method
		emp.getDetails();

		//-- change the state of object using reference
		emp.empno = 101;
		emp.name = "Sanjay";
		emp.sal = 2500f;
		emp.getDetails();

		//-- change the state of object using reference & method
		emp.setDetails();
		emp.getDetails();
	}
}
