package other;

import java.util.Scanner;

/**
 * Created by ZSH
 */
public class MixTest {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        while (true) {
            String str = scan.nextLine();
            if ("exit".equals(str)) return;

//            upp(str);
            low(str);
        }
    }

    private static void upp(String str) {
        char[] chars = str.toCharArray();
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < chars.length; i++) {
            char ch = chars[i];
            if (ch == '_') {
                s.append((char) ((int) chars[i + 1] - 32));
                i++;
            }else {
                s.append(ch);
            }
        }
        System.out.println(s.toString());
    }

    private static void low(String str) {
        char[] chars = str.toCharArray();
        StringBuilder s = new StringBuilder();
        for (char ch : chars) {
            if ('A' <= ch && ch <= 'Z') {
                s.append("_").append((char) ((int) ch + 32));
            } else {
                s.append(ch);
            }
        }
        System.out.println(s.toString());
    }


}
