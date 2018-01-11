package string;

/**
 * Created by ZSH
 */
public class SubstringDemo {
    public static void main(String args[]) {
        String a = "123456789";
        System.out.println("before:" + a);
        String b = a.substring(1);
        System.out.println("after:" + b);
        String c = a.substring(1, 5);
        System.out.println("after:" + c);
    }
}
