package Lab1Package;

import java.util.Scanner;

public class Program10 {
	static boolean Check(String s) {
		s=s.toUpperCase();
		for(int i=1;i<s.length();i++) {
			if(s.charAt(i)<s.charAt(i-1))
				return false;
		}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string: ");
		str=sc.nextLine();
		Program10 p=new Program10();
		System.out.println(p.Check(str));

	}

}
