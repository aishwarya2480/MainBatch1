package Lab2Package;

public class Savings extends Account{
	Savings(long accNum, double bal) {
		super(accNum, bal);
		// TODO Auto-generated constructor stub
	}
	final int min_bal = 500;

	public void withdraw(double amount) {
		if(bal>=min_bal) {
			System.out.println(bal);
			super.withdraw(amount);
		}else {
			System.out.println("Minimum balance must be 500");
		}
	}
	public static void main(String[] args) {
		Savings acc3 = new Savings(9087867, 400);
		System.out.println("The balance is: "+ acc3.getBalance());
		acc3.withdraw(50);
		System.out.println("The balance is: "+acc3.getBalance());
		
		
	}
}

