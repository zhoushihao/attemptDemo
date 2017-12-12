package other;


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
