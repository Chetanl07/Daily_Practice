package ELC;

public class NonStaticVariable {

	public static void main(String []args)
	{
//		BLC.NonStaticVariable raj=new BLC.NonStaticVariable();
//		raj.show();
		
		
		BLC.NonStaticVariable scott=new BLC.NonStaticVariable();
		scott.setEmployeeData(101, "Scott", 90000);
		scott.calculateGrade();
		scott.getEmployeeData();
	}
}
