package genericity;

/**
 * Created by ZSH
 */
public class lambdaExceptionDemo {
    //lambda表达式异常
    public static void main(String args[]) throws EmptyArrayException {
        double[] values = {1.0, 2.0, 3.0, 4.0};
        DoubleNumericArrayFunc average = (n) -> {
            double sum = 0;
            if (n.length == 0)
                throw new EmptyArrayException();

            for (double aN : n) {
                sum += aN;
            }

            return sum / n.length;
        };

        System.out.println("The average is " + average.func(values));
        System.out.println("The average is " + average.func(new double[0]));

    }
}
