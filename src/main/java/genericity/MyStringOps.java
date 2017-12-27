package genericity;

/**
 * Created by ZSH
 */
public class MyStringOps {
    static String strReverse(String str) {
        StringBuilder result = new StringBuilder();
        int i;

        for (i = str.length() - 1; i >= 0; i--) {
            result.append(str.charAt(i));
        }
        return result.toString();
    }
}
