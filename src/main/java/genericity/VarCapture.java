package genericity;

import java.util.List;

/**
 * Created by ZSH
 */
public class VarCapture {
    //lambda表达式 变量捕获
    public static void main(String args[]) {
        int num = 10;
        MyFunc myLambda = (n) -> num + n;
        System.out.println(myLambda.func(10));
    }
}
