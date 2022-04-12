package Lab3Package;

import java.util.Scanner;

public class Program1 {
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the First Name: ");
	System.out.println("Enter last name: ");
	do{
		try {
			String fN=sc.next();
			String lN=sc.next();
			if(fN!=null||fN.isEmpty() && lN!=null||lN.isBlank()) {
				throw new Exception("First and last name should not be blank");
			}
		}catch(Exception e){
			e.printStackTrace();
		}	
	}while(sc.hasNext());
	}
	
}

