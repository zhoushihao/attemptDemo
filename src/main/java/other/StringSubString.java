package other;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 * Created by Administrator on 2017/7/13 0013.
 */
public class StringSubString {

    public static void main(String args[]){
        LocalDate a = LocalDate.now();
        System.out.println(a);
        LocalDate b = LocalDate.of(2015,12,2);
        System.out.println(b);

        final long years = Math.abs(a.until(b, ChronoUnit.YEARS));
        final long months = Math.abs(a.until(b, ChronoUnit.MONTHS)) - 12 * years;
        final long days = Math.abs(a.until(b).getDays());
        final long totalDays = Math.abs(a.until(b, ChronoUnit.DAYS));

        System.out.println(years+"年"+months+"个月"+days+"天"+"("+totalDays+"天)");
    }

}
