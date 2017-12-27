package genericity;

/**
 * Created by ZSH
 */
class MyArrayOps {
    static <T> int countMatching(T[] vals, T v) {
        int count = 0;
        for (T val : vals) {
            if (val == v)
                count++;
        }
        return count;
    }
}
