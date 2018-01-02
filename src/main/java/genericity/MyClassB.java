package genericity;

/**
 * Created by ZSH
 */
public class MyClassB {
    private int val;

    MyClassB(int v) {
        val = v;
    }

    MyClassB() {
        val = 0;
    }

    int getVal() {
        return val;
    }
}
