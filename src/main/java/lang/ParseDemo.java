package lang;

import java.util.Scanner;

/**
 * Created by ZSH
 */
public class ParseDemo {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        String str;
        int i;
        int sum = 0;

        System.out.println("Enter numbers,0 to quit.");

        do {
            str = scan.next();
            try {
                i = Integer.parseInt(str);
            } catch (NumberFormatException e) {
                System.out.println("invalid format");
                i = 0;
            }
            sum += i;
            System.out.println("Current sum is: " + sum);
        } while (i != 0);

    }
}
