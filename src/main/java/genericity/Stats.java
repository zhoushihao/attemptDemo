package genericity;

/**
 * Created by ZSH
 */
public class Stats<T extends Number> {
    private T[] nums;

    Stats(T[] o) {
        this.nums = o;
    }

    double average() {
        double sum = 0.0;
        for (T num : this.nums)
            sum += num.doubleValue();

        return sum / this.nums.length;
    }

    boolean sameAvg(Stats<?> ob){
        return average() == ob.average();
    }
}
