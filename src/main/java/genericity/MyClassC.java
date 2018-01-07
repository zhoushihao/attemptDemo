package genericity;

/**
 * Created by ZSH
 */
class MyClassC<T> {
    private T val;

    MyClassC(T v){
        val = v;
    }

    MyClassC(){
        val = null;
    }

    T getVal(){
        return val;
    }
}
