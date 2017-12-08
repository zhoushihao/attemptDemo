package genericity;

/**
 * Created by ZSH
 */
public class Gen<T> {

    private T ob;

    public Gen(T o) {
        ob = o;
    }

    T getOb(){
        return ob;
    }

    void showType(){
        System.out.println("Type of T is "+ob.getClass().getName());
    }
}
