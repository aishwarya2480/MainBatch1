package Lab3Package;

import java.util.Scanner;

public class EmployeeException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Salary: ");
		do{
			try {
				long salary=sc.nextLong();
				if(salary<3000) {
					throw new Exception("Salary cannot be less than 3000");
				}
			}catch(Exception e){
				e.printStackTrace();
			}	
		}while(sc.hasNextLong());
		}
		
	}

