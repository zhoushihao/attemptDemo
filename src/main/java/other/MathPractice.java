package other;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2017/5/25 0025.
 */
public class MathPractice {

    private String id;
    private String name;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    MathPractice(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public static void main(String[] args) {
        Map<String,Object> map = new HashMap<>();
        map.put("1","1");
        map.put("2","1");
        System.out.println(map.get("1").hashCode());
        System.out.println(map.get("2").hashCode());
    }


}
