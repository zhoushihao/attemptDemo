package string;

import java.util.*;

/**
 * Created by ZSH
 */
public class Other {
    private List<Integer> ints;
    private int i;

    public Other() {
        ints = new ArrayList<>();
        ints.add(1);
    }

    public static void main(String args[]) {
        List<String> s1 = Arrays.asList("11", "22", "33", "44");
        List<String> s2 = Arrays.asList("11","2", "3", "4", "5", "6");
        List<String> s3 = new LinkedList<>(s1);
        Set<String> s = new HashSet<>(s1);
        s.addAll(s2);
        System.out.println(s);

        for (String str : s2) {
            if (!s1.contains(str)) {
                s3.add(str);
            }
        }
        System.out.println(s3);

    }

    public List<Integer> getInts() {
        return ints;
    }

    public void setInts(List<Integer> ints) {
        this.ints = ints;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }
}
