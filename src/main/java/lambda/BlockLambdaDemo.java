package lambda;

/**
 * Created by ZSH
 */
public class BlockLambdaDemo {
    public static void main (String args[]){
        NumericFunc factorial = (n) -> {
            int result = 1;
            for (int i=1;i<=n;i++)
                result *= i;
            return result;
        };
        System.out.println("The factorial of 3 is "+factorial.func(3));//阶乘
        System.out.println("The factorial of 10 is "+factorial.func(10));
    }
}
