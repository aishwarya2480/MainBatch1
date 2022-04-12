package Lab1Package;

public class Program6 {
	String fN;
	String lN;
	String g;
	public Program6(String fN2, String lN2, String g2) {
		// TODO Auto-generated constructor stub
		fN = fN2;
		lN=lN2;
		g=g2;
	}
	void display() {
		System.out.println("Personal Details: "+"\n"+"---------------------------------");
		System.out.println("First Name: "+fN);
		System.out.println("Last Name: "+lN);
		System.out.println("Gender: "+g);
	}
	public static void main(String args[]) {
		 Program6 p1 = new Program6("Aishwarya","Cinnelli","F");
		 p1.display();
	}
}
