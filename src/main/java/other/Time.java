package other;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.List;

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
        System.out.println(new Double(Math.ceil(a)).intValue());

        LocalDate date = LocalDate.now();
        System.out.println(date);

        Double b = 0.0;
        System.out.println(b==0);

    }
}
