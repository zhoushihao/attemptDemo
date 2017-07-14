package java8_practice.base;

/**
 * Created by zsh on 2017/7/7 0007.
 * 异常多重捕获机制
 */
public class MultiCatch {

    public static void main(String args[]){
        int a = 10 , b = 0;
        int vals[] = {1,2,3};

        try{
//            int result = a/b;
            vals[vals.length] = 4;
        }catch (ArithmeticException | ArrayIndexOutOfBoundsException e){
            System.out.println("Exception caught:" + e);
        }
        System.out.println("After multi-catch.");
    }

}
