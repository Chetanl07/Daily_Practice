package ELC;

import BLC.StaticAndNonStaticField;

public class StaticAndNonStatic {
	public static void main(String []args)
	{
		StaticAndNonStaticField raj=new StaticAndNonStaticField(101,"raj", "Ameerpet");
		raj.getStudentData();
		
		System.out.println("-----------------------------------------");
		StaticAndNonStaticField priya=new StaticAndNonStaticField(102,"priya", "SR nager");
		priya.getStudentData();
	}

}
