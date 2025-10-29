package BLC;

public class NonStaticVariable {
	
	/*// allocation the default values for non static variable
	 * int roll;
	String name;
	double fees;
	char grade;
	
	public void show()
	{
		System.out.println(roll);
		System.out.println(name);
		System.out.println(fees);
		System.out.println(grade);
	}
	
	*/
	
	
	// Non static field with parameter variable as per requirement:
	
	int employeeId;
	String employeeName;
	double employeeSalary;
	char employeeGrade;
	
	public void setEmployeeData(int id, String name, double salary)
	{
		employeeId=id;
		employeeName=name;
		employeeSalary=salary;

	}
	
	public void getEmployeeData()
	{
		System.out.println("Employee ID is : "+employeeId);
		System.out.println("Employee Name is: "+employeeName);
		System.out.println("Employee salary id:"+employeeSalary);
		System.out.println("Employee Grade id:"+employeeGrade);
	}
	
	
	public void calculateGrade()
	{
		if(employeeSalary>=75000) employeeGrade='A';
		else if(employeeSalary>=50000)employeeGrade='B';
		else if(employeeSalary>=40000)employeeGrade='C';
		else employeeGrade='D';
	}
}


