package genericity;

/**
 * Created by ZSH
 */
public interface MinMax<T extends Comparable> {
    T min();
    T max();
}
