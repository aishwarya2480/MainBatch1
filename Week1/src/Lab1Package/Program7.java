package Lab1Package;

import java.security.PublicKey;

public class Program7 {
		String fN;
		String lN;
		String g;
		String n;
	   Program7(String fN2, String lN2, String g2, String n2) {
			// TODO Auto-generated constructor stub
			fN = fN2;
			lN=lN2;
			g=g2;
			n=n2;
		}
		void display() {
			System.out.println("Personal Details: "+"\n"+"---------------------------------");
			System.out.println("First Name: "+fN);
			System.out.println("Last Name: "+lN);
			System.out.println("Gender: "+g);
			System.out.println("Phone no: "+n);
		}
		public static void main(String args[]) {
			 Program7 p1 = new Program7("Aiswarya","Cinnelli","F","9381756671");
			 p1.display();
	}
}
