package genericity;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by ZSH
 */
public class UseMethodRef {
    private static int compareMC(MyClassB a, MyClassB b) {
        return a.getVal() - b.getVal();
    }

    public static void main(String args[]) {
        List<MyClassB> al = Arrays.asList(
                new MyClassB(1),
                new MyClassB(4),
                new MyClassB(2),
                new MyClassB(9),
                new MyClassB(3),
                new MyClassB(7)
        );

        MyClassB maxValObj = Collections.max(al, UseMethodRef::compareMC);

        System.out.println("Maximum value is: " + maxValObj.getVal());

    }
}
