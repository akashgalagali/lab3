package l3;
import java.time.*;
import java.util.*;
public class DateDiff {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the year:");
		int y=sc.nextInt();
		System.out.println("Enter the Month:");
		int m=sc.nextInt();
		System.out.println("Enter the Day:");
		int d=sc.nextInt();
		LocalDate idate = LocalDate.of(y, m, d);
        LocalDate now = LocalDate.now();
 
        Period diff = Period.between(idate, now);
 
     System.out.printf("\nDifference is %d years, %d months and %d days old\n\n", 
                    diff.getYears(), diff.getMonths(), diff.getDays());
 
	}

}
