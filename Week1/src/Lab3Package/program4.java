package Lab3Package;

import java.util.Arrays;
import java.util.Scanner;

public class program4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no.of Products: ");
		int n=sc.nextInt();
		System.out.println("enter the products: ");
		String[] Products = new String[n];
		for(int i=0;i<n;i++) {
			Products[i] = sc.next();
		}
		Arrays.sort(Products);
		System.out.println(Arrays.toString(Products));
	}

}
