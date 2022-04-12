package Lab3Package;

import java.util.Scanner;

public class Program2 {

	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the age: ");
		do{
			try {
				int age=sc.nextInt();
				if(age<15) {
					throw new Exception("Age should be greater than 15");
				}
			}catch(Exception e){
				e.printStackTrace();
			}	
		}while(sc.hasNextInt());
		}

}
