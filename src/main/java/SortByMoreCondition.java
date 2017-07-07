import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by zsh on 2017/6/8 0008.
 */
public class SortByMoreCondition {

    private String id;
    private int level;
    private int salary;
    private int age;

    private int hot;

    public static void main(String[] args) {
        List<SortByMoreCondition> list = new ArrayList<>();
        SortByMoreCondition bean1 = new SortByMoreCondition("0001", 1, 1000, 20);
        list.add(bean1);
        SortByMoreCondition bean2 = new SortByMoreCondition("0002", 1, 2000, 30);
        list.add(bean2);
        SortByMoreCondition bean3 = new SortByMoreCondition("0003", 1, 2000, 40);
        list.add(bean3);
        SortByMoreCondition bean4 = new SortByMoreCondition("0004", 2, 1000, 10);
        list.add(bean4);

        Comparator<SortByMoreCondition> comparator = (o1, o2) -> {
            int a = o1.level - o2.level;
            int b = o1.salary - o2.salary;
            int c = o1.age - o2.age;
            if(a==0){
                if(b==0){
                    return -c;
                }
                return -b;
            }
            return -a;
        };

        Collections.sort(list, comparator);
        list.forEach(entity -> System.out.println(entity.getId()+","+entity.getLevel()+","+entity.getSalary()+","+entity.getAge()));
    }


    public SortByMoreCondition(String id, int level, int salary, int age) {
        this.id = id;
        this.level = level;
        this.salary = salary;
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHot() {
        return hot;
    }

    public void setHot(int hot) {
        this.hot = hot;
    }
}
