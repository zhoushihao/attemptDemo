package other;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

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
        List<MathPractice> list = Arrays.asList(
                new MathPractice("1", "1"),
                new MathPractice("2", "2"));
        Map<String, Object> map = list.stream().collect(Collectors.toMap(MathPractice::getId, MathPractice::getName));

        System.out.println(map);

        Integer d = 11;
        StringBuilder sbf = new StringBuilder("移库数量超出库存量的商品为:");
        for (int i=1;i<6;i++){
            sbf.append(String.format("%d:%s(%s)库存量为:%s,移库数量为:%d;", i, "pp61", "珍珠红", "2", d)
            );
        }
        System.out.println(sbf.toString());
    }


}
