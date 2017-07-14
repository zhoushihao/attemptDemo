package other;

/**
 * Created by Administrator on 2017/7/13 0013.
 */
public class StringSubString {

    public static void main(String args[]){
        String str = "E01PDD20170712064";
        String sub = str.substring(str.length()-3);
        Integer a = Integer.parseInt(sub);
        System.out.println(a);
    }

}
