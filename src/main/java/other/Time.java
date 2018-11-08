package other;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 * Created by ZSH
 */
public class Time {
    public static void main(String args[]) {
        LocalDate startDate = LocalDate.of(2018, 4, 28);
        LocalDate endDate = LocalDate.of(2017, 1, 20);
        long days = Math.abs(endDate.until(startDate, ChronoUnit.DAYS));
        System.out.println(days);
        System.out.println("==============================================");
        int a = 1;
        System.out.println(a++);
        System.out.println(a++);

//        System.out.println(startDate.compareTo(endDate));
//
//        double a = 3.1111;
//        System.out.println(Math.ceil(a));

//        LocalDate date = LocalDate.now();
//        System.out.println(date.format(DateTimeFormatter.ISO_LOCAL_DATE));

//        Double b = 0.0;
//        System.out.println(b==0);

    }
}
