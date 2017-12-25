package genericity;

/**
 * Created by ZSH
 */
public class lambfaAsArgumentsDemo {
    //作为参数传递lambda表达式
    private static String stringOp(StringFunc sf, String s) {
        return sf.func(s);
    }

    public static void main(String args[]) {
        String inStr = "lambda add power to Java";
        String outStr;

        System.out.println("here is input string:" + inStr);

        outStr = stringOp(String::toUpperCase, inStr);
        System.out.println("The string in uppercase: " + outStr);

        //======================================================================

        outStr = stringOp((str) -> {
            StringBuilder result = new StringBuilder();
            int i;

            for (i = 0; i < str.length(); i++) {
                if (str.charAt(i) != ' ')
                    result.append(str.charAt(i));
            }
            return result.toString();
        }, inStr);

        System.out.println("The String with spaces removed: " + outStr);

        //=======================================================================

        StringFunc reverse = (str) -> {
            StringBuilder result = new StringBuilder();
            int i;
            for (i = str.length() - 1; i >= 0; i--) {
                result.append(str.charAt(i));
            }
            return result.toString();
        };

        System.out.println("The string reversed: " + stringOp(reverse, inStr));
    }
}
