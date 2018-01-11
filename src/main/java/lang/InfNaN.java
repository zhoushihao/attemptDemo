package lang;

/**
 * Created by ZSH
 */
public class InfNaN {
    public static void main(String args[]) {
        Double d1 = 1 / 0.;//无穷大
        Double d2 = 0 / 0.;//不是数字
        System.out.println(d1 + ": " + d1.isInfinite() + ", " + d1.isNaN());
        System.out.println(d2 + ": " + d2.isInfinite() + ", " + d2.isNaN());
    }
}
