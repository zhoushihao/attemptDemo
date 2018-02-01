package lang;

/**
 * Created by ZSH
 * 时间计数
 */
public class Elapsed {
    public static void main(String args[]) {
        long start, end;
        System.out.println("Timing a for loop from 0 to 100,000,000");

        start = System.currentTimeMillis();

        for (long i = 0; i < 100000000; i++) ;

        end = System.currentTimeMillis();

        System.out.println("Elapsed time: " + (end - start) + "毫秒");

        start = System.nanoTime();

        for (long i = 0; i < 100000000; i++) ;

        end = System.nanoTime();

        System.out.println("Elapsed time: " + (end - start) + "纳秒");
    }
}
