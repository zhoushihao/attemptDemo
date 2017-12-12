package genericity;

/**
 * Created by ZSH
 */
public class MyClass<T extends Comparable> implements MinMax<T> {
    T[] vals;

    MyClass(T[] o) {
        vals = o;
    }

    @Override
    public T min() {
        T v = vals[0];
        for (int i = 1; i < vals.length; i++)
            if (vals[i].compareTo(v) < 0)
                v = vals[i];
        return v;
    }

    @Override
    public T max() {
        return null;
    }
}
