package other;

import java.util.HashMap;

/**
 * Created by Administrator on 2017/5/26 0026.
 */
public class MapPractice {

    public static void main(String[] strs){
        HashMap<String,String> map = new HashMap<>();
        map.put("ff664d90-aa76-4b59-a20b-1487dda1aee219ca876a-3902-44de-8fc8-2b54e01cacc1","1");
        map.put("ff664d90-aa76-4b59-a20b-1487dda1aee219ca876a-3902-44de-8fc8-2b54e01cacc2","2");
        System.out.println(map.get("ff664d90-aa76-4b59-a20b-1487dda1aee219ca876a-3902-44de-8fc8-2b54e01cacc1"));
        System.out.println((Double.parseDouble("1")+1)+"");
    }

}
