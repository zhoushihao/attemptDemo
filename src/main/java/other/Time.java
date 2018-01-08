package other;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

/**
 * Created by ZSH
 */
public class Time {
    public static void main(String args[]) {
        LocalDate startDate = LocalDate.of(2017,1,1);
        LocalDate endDate = LocalDate.of(2016,1,2);
        long days = Math.abs(startDate.until(endDate, ChronoUnit.DAYS));
        System.out.println(days);
        System.out.println(startDate.compareTo(endDate));

        double a = 3.1111;
        System.out.println(Math.ceil(a));

        LocalDate date = LocalDate.now();
        System.out.println(date.format(DateTimeFormatter.ofPattern("yyyy年MM月dd日")));

        Double b = 0.0;
        System.out.println(b==0);

    }
}
