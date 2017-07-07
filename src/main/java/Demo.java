import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by Administrator on 2017/5/27 0027.
 */
public class Demo {

    //break对代码块的作用
    public void breakExplain() {
        boolean tf = true;
        a:
        {
            System.out.println("aaa");
            b:
            {
                System.out.println("bbb");
                c:
                {
                    System.out.println("请开始你的表演");
                    if ((tf)) break c;
                    System.out.println("c");
                }
                System.out.println("b");
            }
            System.out.println("a");
        }
    }
}

class A {
    A() {
        System.out.println("A");
    }
}

class Demo1 {
    public static void main(String[] args) {
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            public void run() {
                System.out.println(new Date() + "看看还有没有重复调用");
            }
        }, 2000,1000);
    }
}
