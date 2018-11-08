package lang;

/**
 * Created by ZSH
 */
public class CloneDemo {
    public static void main (String args[]){
        TestClone x1 = new TestClone();
        TestClone x2;

        x1.a = 10;
        x1.b = 20.98;

        x2 = x1.cloneTest();

        System.out.println("x1:a=" + x1.a + ",b=" +x1.b);
        System.out.println("x2:a=" + x2.a + ",b=" +x2.b);
    }
}
