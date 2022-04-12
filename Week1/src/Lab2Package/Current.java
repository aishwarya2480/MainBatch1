package Lab2Package;

public class Current extends Account{
	public Current(long accNum, double bal) {
		super(accNum, bal);
		// TODO Auto-generated constructor stub
	}

	int overDraft=1000;
	public void withdraw(double amount) {
		if(amount == overDraft) {
			super.withdraw(amount);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Current acc4=new Current(90878,50000);
		acc4.withdraw(1000);
	}

}
