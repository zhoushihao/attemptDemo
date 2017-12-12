package genericity;

import java.util.Arrays;
import java.util.List;

/**
 * Created by ZSH
 */
public class GenMethDemo {
    private static <T extends Comparable<T>, V extends T> boolean isIn(T x, V[] y) {
        for (V aY : y) if (x.equals(aY)) return true;
        return false;
    }

    public static void main(String args[]) {
        Integer nums[] = {1, 2, 3, 4, 5};
        List<Integer> num = Arrays.asList(2, 7);
        num.forEach(entity -> {
            if (isIn(entity, nums))
                System.out.println(entity + " is in nums");
            else
                System.out.println(entity + " is not in nums");
        });
        System.out.println();

        String[] strs = {"one","two","three","four","five"};
        List<String> str = Arrays.asList("two","seven");
        str.forEach(entity -> {
            if (isIn(entity, strs))
                System.out.println(entity + " is in strs");
            else
                System.out.println(entity + " is not in strs");
        });
    }
}
