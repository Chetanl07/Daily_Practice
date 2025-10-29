package BLC;

public class StaticAndNonStaticField {
	int rollStudent;
	String studentName,studentAddress;
	static String collageName="NIT",courseName="Adv.Java";
	public StaticAndNonStaticField(int rollStudent, String studentName, String studentAddress) {
		super();
		this.rollStudent = rollStudent;
		this.studentName = studentName;
		this.studentAddress = studentAddress;
	}
	
	public void getStudentData()
	{
		System.out.println("Student Roll Number is:"+rollStudent);
		System.out.println("Student name is :"+studentName);
		System.out.println("Student Address is :"+studentAddress);
		System.out.println("College name is :"+collageName);
		System.out.println("Course Name is:"+courseName);
	}

}
