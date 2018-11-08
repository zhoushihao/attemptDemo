import string.Other;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ZSH
 */
public class StringExample {
    public static void main(String args[]) {
        List<Other> list = new ArrayList();

        double sum = list.stream().mapToInt(Other::getI).sum();

        System.out.println(sum);
    }
}
