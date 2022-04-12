package Lab4Package;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Program4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the no.of products: ");
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println("Enter the products into Array list: ");
		ArrayList<String> Products = new ArrayList<String>(n);
		for(int i=1;i<=n;i++) {
			Products.add(sc.next());
		}
		for(int i=0;i<n;i++) {
			Collections.sort(Products);
		}
		System.out.println(Products);
	}

}
