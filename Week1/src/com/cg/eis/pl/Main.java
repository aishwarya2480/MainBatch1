package com.cg.eis.pl;
import java.util.Scanner;
import com.cg.eis.bean.*;

import co.cg.eis.service.*;

public class Main extends Employee implements Service {

	public Main(String firstname, String lastname, int id, String designation, int salary) {
		super(firstname, lastname, id, designation, salary);
		// TODO Auto-generated constructor stub
	}
	public String InsuranceServices(int salary) {
		if(salary>5000 && salary<20000) {
			return "Scheme C";
		}else if(salary>=20000 && salary<40000) {
			return "Scheme B";
		}else if(salary>=40000) {
			return "Scheme A";
		}
		return "NO Scheme";
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no.of employees details: ");
		int n =sc.nextInt();
		for(int i=0;i<n;i++) {
			System.out.println("Enter the first name: ");
			String firstname=sc.next();
			System.out.println("Enter the last name: ");
			String lastname=sc.next();
			System.out.println("Enter employees id: ");
			int id=sc.nextInt();
			System.out.println("Enter the designation of employee: ");
			String designation=sc.next();
			System.out.println("Enter the employee's salary: ");
			int salary=sc.nextInt();
			Main m = new Main(firstname,lastname,id,designation,salary);
			String scheme=m.InsuranceServices(salary);
			System.out.println("The employee details are: "+"\n"+"------------------------------------------------------"+"\n"+"Employee name: "+firstname+" "+lastname);
			System.out.println("Employee id: "+id+"\n"+"Employee designation: "+designation+"\n"+"Employee Salary: "+salary+"\n"+"Employee applicable scheme: "+scheme);
			
		}
	}
	
	
}
