package string;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ZSH
 */
public class SortString {
    String str = new String("good");
    char[] ch = {'a','b','c'};
    public static void main (String args[]){
       SortString ss = new SortString();
       ss.change(ss.str,ss.ch);
       System.out.print(ss.str+" and ");
       System.out.println(ss.ch);
       int[] a = new int[10];
       System.out.println(a[0]);
       String[] s = new String[10];
       System.out.println(s[0]);

    }

    public void change(String str,char ch[]){
        str = "test ok";
        ch[0] = 'g';
    }
}
