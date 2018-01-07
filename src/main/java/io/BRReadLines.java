package io;

import org.springframework.util.StringUtils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by ZSH
 */
public class BRReadLines {

    public static void main(String args[]){
        String str = " a s d f as b z";
        char cs[] = StringUtils.trimAllWhitespace(str).toCharArray();
        int[] array = new int[128];
        for (char item : cs) {
            array[item]++;
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                System.out.println(array[i] + ":" + (char) i);
            }
        }
    }

    private static void main1() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter lines of text.");
        System.out.println("Enter 'stop' to quit.");
        String str;
        do {
            str = br.readLine();
            System.out.println(str);
        } while (!str.equals("stop"));
    }

    private static void main2() {
        int b;
        b = 'A';
        System.out.println(b);
        System.out.write(b);
        System.out.write('\n');
    }
}
