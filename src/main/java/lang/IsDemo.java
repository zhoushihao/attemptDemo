package lang;

/**
 * Created by ZSH
 */
public class IsDemo {
    public static void main(String args[]) {
        char[] a = {'a', 'b', '5', '?', 'A', ' '};

        for (char ch : a) {
            if (Character.isDigit(ch))//是否是数字
                System.out.println(ch + " is a digit.");
            if (Character.isLetter(ch))//是否是字母
                System.out.println(ch + " is a letter.");
            if (Character.isWhitespace(ch))
                System.out.println(ch + " is whitespace");
            if (Character.isUpperCase(ch))
                System.out.println(ch + " is uppercase");
            if (Character.isLowerCase(ch))
                System.out.println(ch + " is lowercase");
        }
    }
}
