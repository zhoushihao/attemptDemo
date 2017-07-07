package other;

import java.util.HashMap;

/**
 * Created by Administrator on 2017/5/26 0026.
 */
public class MapPractice {

    public static void main(String[] strs){
        HashMap<String,String> map = new HashMap<>();
        map.put("1","1");
        map.put("1","2");
        map.put("1","3");
        map.put("1","4");
        map.put("1","5");
        map.put("2","5");
        map.put("2","6");
        System.out.print(map);
    }

}
