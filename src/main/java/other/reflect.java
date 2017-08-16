package other;

import com.alibaba.fastjson.JSONObject;

import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Created by ZSH
 */
public class reflect {

    public static void main (String args[]){
        Map<String,Object> map = new HashMap<>();
        map.put("id","123123123");
        List<String> list = Arrays.asList("色母","清漆");
        map.put("type",list);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        map.put("date",sdf.format(new Date()));
        System.out.println(JSONObject.toJSONString(map));
    }
}
