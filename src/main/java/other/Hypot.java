package other;

//======================================
import static java.lang.Math.sqrt;//开方
import static java.lang.Math.pow;//幂
//======================================
/**
 * Created by ZSH
 * <p>
 * 静态导入
 */
public class Hypot {
    public static void main(String args[]) {
        double side1 = 3.0;
        double side2 = 4.0;
        double hypot;

        hypot = sqrt(pow(side1,2)+pow(side2,2));

        System.out.println(hypot);
    }
}
