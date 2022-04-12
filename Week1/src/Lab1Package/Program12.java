package Lab1Package;
import java.time.LocalDate;
import java.time.Period;

	public class Program12 {
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			LocalDate d1 = LocalDate.of(2022,1,1);
			LocalDate d2=LocalDate.of(2022, 3, 3);
			Period p = Period.between(d1,d2);
			System.out.println("Years: "+p.getYears());
			System.out.println("Months: "+p.getMonths());
			System.out.println("Days: "+p.getDays());	

		}

}
