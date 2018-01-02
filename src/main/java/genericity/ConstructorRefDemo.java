package genericity;

/**
 * Created by ZSH
 */
public class ConstructorRefDemo {
    public static void main (String args[]){
        MyFuncC myClassCons = MyClassB::new;

        MyClassB mc = myClassCons.func(100);

        System.out.println("val in mc is " + mc.getVal());
    }
}
