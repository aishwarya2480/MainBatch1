package Lab2Package;

import java.util.Scanner;

public class Account {
	long accNum;
	double bal;
	public Account(long accNum, double bal) {
		// TODO Auto-generated constructor stub
		this.accNum = accNum;
		this.bal=bal;
		
	}
	public void withdraw(double amount) {
		bal = bal-amount;
		System.out.println("After withdrawl the balance is: "+bal);
		
	}
	public void deposite(double amount) {
		bal=bal+amount;
		System.out.println("After desposit the balance amount is: "+bal);
	}
	double getBalance() {
		return bal; 
	}
}

class Person extends Account{
		public Person(long accNum, double bal) {
			super(accNum, bal);
			// TODO Auto-generated constructor stub
		}
		String name;
		double age;
		public void display() {
			System.out.println("Name: "+name);
			System.out.println("Age: "+age);
		}
		public static void main(String[] args){	
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter name: ");
			String name = sc.nextLine();
			System.out.println("Enter age: ");
			double age = sc.nextDouble();
			Account acc1=new Account(9087654, 2000);
			System.out.println("Name: "+name+", Age: "+age+", The balance is: "+acc1.getBalance());
			System.out.println("Enter name: ");
			String name2 = sc.next();
			System.out.println("Enter age: ");
			int age2 = sc.nextInt();
			Account acc2 = new Account(9087867,3000);
			System.out.println("Name: "+name+", Age: "+age+", The balance is: "+acc2.getBalance());
			acc1.deposite(2000);
			System.out.println("Name: "+name+", Age: "+age+", The balance is: "+acc1.getBalance());
			acc2.withdraw(2000);
			System.out.println("Name: "+name+", Age: "+age+", The balance is: "+acc2.getBalance());
			
		}
	}
		


