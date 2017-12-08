package other;


import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Created by Administrator on 2017/5/26 0026.
 */
public class MapPractice {
    public static MapPractice a = new MapPractice();
    {
        System.out.println("A");
    }

    static {
        System.out.println("B");
    }

    public static void main(String[] strs) {
        MapPractice b = new MapPractice();
    }

}
