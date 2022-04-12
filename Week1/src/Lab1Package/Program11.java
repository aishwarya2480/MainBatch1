package Lab1Package;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;

public class Program11 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate current = LocalDate.now();
		LocalDate d1=LocalDate.of(2022, 3, 3);
		Period p = Period.between(d1,current);
		System.out.println("Years: "+p.getYears());
		System.out.println("Months: "+p.getMonths());
		System.out.println("Days: "+p.getDays());	

	}

}
