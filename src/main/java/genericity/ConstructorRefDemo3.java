package genericity;

/**
 * Created by ZSH
 */
public class ConstructorRefDemo3 {
    private static <R, T> R myClassFactory(MyFuncE<R, T> cons, T v) {
        return cons.func(v);
    }

    public static void main(String args[]) {
        MyFuncE<MyClassC<Double>, Double> myClassCons = MyClassC::new;

        MyClassC<Double> mc = myClassFactory(myClassCons, 100.1);

        System.out.println("val in mv is " + mc.getVal());


        MyFuncE<MyClass2, String> myClassCons2 = MyClass2::new;

        MyClass2 mc2 = myClassFactory(myClassCons2, "lambda");

        System.out.println("str in mc2 is " + mc2.getStr());
    }
}
