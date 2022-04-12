package Lab4Package;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Program2 {
	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(new FileReader("C:\\Batch1\\Week1\\src\\Lab4Package\\numbers"));
			sc.useDelimiter(",");
			while(sc.hasNextInt()) {
				int i=sc.nextInt();
				if(i%2==0) {
					System.out.println(i);
				}
			}
			System.out.println("Done");
	}catch(IOException e) {
		System.out.println("exception");
	}


	}

}
