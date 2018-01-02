package genericity;

/**
 * Created by ZSH
 */
public class ConstructorRefDemo2 {
    public static void main(String args[]) {
        MyFuncD<Integer> myClassCons = MyClassC::new;

        MyClassC<Integer> mc = myClassCons.func(100);

        System.out.println("val in mc is " + mc.getVal());
    }
}
