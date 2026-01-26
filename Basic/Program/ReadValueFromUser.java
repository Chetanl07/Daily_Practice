package Basic;

import java.util.Scanner;

public class ReadValueFromUser {

	public static void main(String[] args) {
		
		/*
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name:");
		String name=sc.nextLine();
		System.out.println("Your Name is:"+name);
		*/
		
		/*
// take a character 
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your gender [M/F]");
		char gender=sc.next().charAt(0);
		System.out.println("Your Gender is :"+gender);
		*/
		
// take a student data from user
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter your roll:");
		int roll=Integer.parseInt(sc.nextLine());
		
		System.out.println("enter your name:");
		String name= sc.nextLine();
		
		System.out.println("Enter your Fees");
		double fees=Double.parseDouble(sc.nextLine());
		
		System.out.println("Your roll number is:"+roll);
		System.out.println("Your Name "+name);
		System.out.println("your fees is:"+fees);
		
		sc.close();
		
	}

}
