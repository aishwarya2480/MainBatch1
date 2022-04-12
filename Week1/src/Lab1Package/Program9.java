package Lab1Package;

import java.util.Scanner;

public class Program9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = new String ("aishwarya");
		char[] ch=str.toCharArray();
		StringBuilder b=new StringBuilder();
		int n;
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		switch(n){
		case 1:
			System.out.println(str+str);
			break;
		case 2:
			for(int i=0;i<str.length();i++) {
				if(i%2!=0) {
					str = str.substring(0, i-1)+ "#"+str.substring(i, str.length());
				}
			}
			System.out.println(str);
			break;
		case 3:
			for(int i=0;i<str.length();i++) {
					if(b.indexOf(String.valueOf(str.charAt(i)))==-1) {
						b.append(str.charAt(i));
					}
				}
			System.out.println(b.toString());
			break;
		case 4:
			for(int i=0;i<ch.length;i=i+2) {
				ch[i]=Character.toUpperCase(ch[i]);
				}
			System.out.println(new String(ch));
			break;
	}
		
}
}


