package java8_practice.base;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/7/11 0011.
 */
public class ListToString {

    public static void main(String arges[]){
        List<String> strings = new ArrayList<>();
        strings.add("111");
        strings.add("222");
        strings.add("333");
        StringBuffer sbf = new StringBuffer();
        strings.forEach(entity->sbf.append("'"+entity+"'"+","));
        sbf.insert(0,"(").insert(sbf.length()-1,")");
        String str = sbf.substring(0,sbf.length()-1);
        System.out.println(str);
    }

}
