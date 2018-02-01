package lang;

/**
 * Created by ZSH
 */
public class StringConversions {
    public static void main(String args[]) {
        int num = 19648;
        System.out.println(num + " in binary: " + Integer.toBinaryString(num));//转二进制
        System.out.println(num + " in octal: " + Integer.toOctalString(num));//转八进制
        System.out.println(num + " in hexadecimal: " + Integer.toHexString(num));//转十六进制
    }
}
