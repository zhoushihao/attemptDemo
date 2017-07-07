package java8_practice.interfaceMethod;


/**
 * Created by Administrator on 2017/7/7 0007.
 */
public interface InterfaceDefaultMethod {
    default void getString(){
        System.out.println("default method");
    }
}
