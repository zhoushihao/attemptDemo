package other;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by ZSH
 */
public class reflect {

    public static void main (String args[]) throws ParseException {
//        Map<StringExample,Object> map = new HashMap<>();
//        map.put("id","123123123");
//        List<StringExample> list = Arrays.asList("色母","清漆");
//        map.put("type",list);
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
//
//        map.put("date",sdf.format(new Date()));
//        System.out.println(JSONObject.toJSONString(map));

        String s = "2017-7-10 00:00:01";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = sdf.parse(s);
        sdf = new SimpleDateFormat("yyyy/MM/dd");

        System.out.println("         ".length());
    }
}
