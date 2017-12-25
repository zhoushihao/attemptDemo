package genericity;

/**
 * Created by ZSH
 */
public class GenericFunctionalInterfaceDemo {
    //泛型函数式接口
    public static void main(String args[]) {
        SomeFunc<String> reverse = (str) -> {
            StringBuilder result = new StringBuilder();
            int i;

            for (i = str.length() - 1; i >= 0; i--)
                result.append(str.charAt(i));

            return result.toString();
        };

        System.out.println("lambda reversed is " + reverse.func("lambda"));
        System.out.println("lambda reversed is " + reverse.func("Expression"));

        SomeFunc<Integer> factorial = (n) -> {
            int result = 1;

            for (int i = 1; i <= n; i++)
                result *= i;

            return result;
        };

        System.out.println("The factorial of 3 is " + factorial.func(3));
        System.out.println("The factorial of 5 is " + factorial.func(5));
    }
}
