package lambda;

/**
 * Created by ZSH
 */
public class LambdaDemo2 {
    public static void main(String args[]) {
        NumericTest isEven = (n) -> n % 2 == 0;
        for (int i = 1; i <= 10; i++) {
            if (isEven.test(i))
                System.out.println(i + " is even.");
            else
                System.out.println(i + " is not even.");
        }

    }
}
