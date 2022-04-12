package Lab1Package;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Scanner;

public class Program14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the zone id: ");
		String id = sc.nextLine();
		ZonedDateTime ct = ZonedDateTime.now(ZoneId.of(id));
		System.out.println(id+ ": "+ct);
		

	}

}
