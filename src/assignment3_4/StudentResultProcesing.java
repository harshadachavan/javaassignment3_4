package assignment3_4;

import java.util.Scanner;

public class StudentResultProcesing extends Student{
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s1 = new Student();
		
		
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < 3; i++){
		System.out.println("Enter your name :");
		String stname = sc.next();
		s1.setName(stname);
		
		System.out.println("Enter your phone number :");
		String stphone = sc.next();
		s1.setPhone(stphone);
		
		System.out.println("Enter your Class :");
		String classname = sc.next();
		s1.setClassname(classname);
		
		System.out.println("Enter your Roll number :");
		int roll = sc.nextInt();
		s1.setRollnumber(roll);
		
		System.out.println("Enter Marks for subject 1 :");
		
		int mrk1 = sc.nextInt();
		
		System.out.println("Enter Marks for subject 2 :");
		int mrk2 = sc.nextInt();
		
		System.out.println("Enter Marks for subject 3 :");
		int mrk3 = sc.nextInt();
		
		s1.displayResult();
		results(mrk1,mrk2,mrk3);
	}
		
		sc.close();
	}
	
	public static void results(int p,int c,int m) {
		int sum = (p+c+m)/3;
		
		if(sum > 35)
		{
			
			System.out.println("You have Passed");
		}
		if(sum < 35)
		{
			System.out.println("You have failed");
		}
	}

}
