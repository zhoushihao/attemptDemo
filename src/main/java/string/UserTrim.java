package string;

import java.io.IOException;
import java.util.Scanner;

/**
 * Created by ZSH
 */
public class UserTrim {
    public static void main(String args[]) throws IOException {
        Scanner scan = new Scanner(System.in);
        String str;

        System.out.println("Enter 'stop' to quit.");
        System.out.println("Enter State:");

        do {
            str = scan.next();
            str = str.trim();

            switch (str) {
                case "Illinois":
                    System.out.println("Capital is Spring field.");
                    break;
                case "Missouri":
                    System.out.println("Capital is Jefferson City.");
                    break;
                case "California":
                    System.out.println("Capital is Sacramento.");
                    break;
                case "Washington":
                    System.out.println("Capital is Olympia.");
                    break;
            }
        } while (!str.equals("stop"));
    }
}
