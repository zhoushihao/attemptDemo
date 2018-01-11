package string;

/**
 * Created by ZSH
 */
public class DeleteDemo {
    public static void main(String args[]) {
        StringBuffer sb = new StringBuffer("This is a test");

        sb.delete(4, 7);
        System.out.println(sb);

        sb.deleteCharAt(10);//注意下标不要越界
        System.out.println("After deleteCharAt: " + sb);
    }
}
