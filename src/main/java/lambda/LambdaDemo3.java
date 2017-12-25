package lambda;

/**
 * Created by ZSH
 */
public class LambdaDemo3 {
    public static void main(String args[]) {
        NumberTest2 isFactor = (n, d) -> n % d == 0;

        int counter = 0;
        for (int i = 1; i <= 100; i++) {
            for (int j = 1; j <= 100; j++) {
                if (isFactor.test(i, j)) {
                    System.out.print("(" + i + "," + j + ")  ");
                    counter++;
                    if (counter == 10) {
                        System.out.println();
                        counter = 0;
                    }
                }
            }
        }
    }
}
