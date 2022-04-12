package Lab1Package;
import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.Temporal;
import java.util.Scanner;
public class Program13 {
static void getExpire(String date, int years, int months) {
	LocalDate pd = LocalDate.parse(date);
	Period p1= Period.ofYears(years);
	Temporal temp1=p1.addTo(pd);
	Period p2= Period.ofMonths(months);
	Temporal temp2 = p2.addTo(temp1);
	System.out.println("The waranty period is till: "+temp2);
}
public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter date 'yyyy-mm-dd format: ");
		String d1=sc.nextLine();
		System.out.println("Enter no.of years of waranty period: ");
		int years = sc.nextInt();
		System.out.println("Enter no.of months of waranty period: ");
		int months = sc.nextInt();
		Program13 obj=new Program13();
		obj.getExpire(d1, years, months);
	}

}
