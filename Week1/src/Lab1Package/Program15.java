package Lab1Package;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Program15 {
	String fN;
	String lN;
	static void getFullName(String fN,String lN) {
		System.out.println(fN + " "+lN);
	}
	static void calculateAge(String dob) {
		LocalDate date = LocalDate.parse(dob);
		LocalDate curr = LocalDate.now();
		Period p= Period.between(date, curr);
		System.out.println("Your age is : "+p.getYears()+" years "+p.getMonths()+" Months "+p.getDays()+"Days");
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Program15 pro=new Program15();
		System.out.println("Enter First Name : ");
		pro.fN = sc.nextLine();
		System.out.println("Enter Last Name: ");
		pro.lN = sc.nextLine();
		System.out.println("Enter you dob in format yyyy-mm-dd: ");
		String dob =sc.nextLine();
		pro.getFullName(pro.fN, pro.lN);
		pro.calculateAge(dob);
		

	}

}
