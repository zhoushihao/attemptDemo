package string;

/**
 * Created by ZSH
 */
public class AppendDemo {
    public static void main(String args[]) {
        String s;
        int a = 42;
        StringBuffer sb = new StringBuffer();

        s = sb.append("a = ").append(a).append("!").toString();
        System.out.println(s);
    }
}
