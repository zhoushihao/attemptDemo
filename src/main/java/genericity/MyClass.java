package genericity;

/**
 * Created by ZSH
 */
public class MyClass<T extends Comparable> implements MinMax<T> {
    private T[] vals;

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
        T v = vals[0];
        for (int i = 1; i < vals.length; i++)
            if (vals[i].compareTo(v) > 0)
                v = vals[i];
        return v;
    }

    public static void main(String args[]) {
        Integer inums[] = {3, 6, 2, 8, 6};
        Character chs[] = {'z', 'b', 'y', 'a'};

        MyClass<Integer> iob = new MyClass<>(inums);
        MyClass<Character> cob = new MyClass<>(chs);

        System.out.println("Max value in inums: "+iob.max());
        System.out.println("Min value in inums: "+iob.min());
        System.out.println("Max value in chs: "+cob.max());
        System.out.println("Min value in chs: "+cob.min());

    }
}
