package other;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Created by ZSH
 */
public class EnumTest {

    public static void main (String args[]){
        LocalDateTime date = LocalDateTime.parse("1980-01-01T00:00:00");
        System.out.println(date.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));
    }
}
