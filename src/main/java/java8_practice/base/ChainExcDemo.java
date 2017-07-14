package java8_practice.base;

/**
 * Created by zsh on 2017/7/7 0007.
 *
 * 链式异常处理机制
 */
public class ChainExcDemo {

    static void demoproc(){
        NullPointerException e = new NullPointerException("top layer");
        e.initCause(new ArithmeticException("cause"));
        throw e;
    }

    public static void main(String[] args){
        try {
            demoproc();
        }catch (NullPointerException e){
            System.out.println("Cause:"+e);

            System.out.println("Origianl cause:"+e.getCause());
        }
    }

}
