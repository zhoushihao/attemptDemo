package string;

/**
 * Created by ZSH
 */
public class StringBufferDemo {
    public static void main(String args[]) {
        StringBuffer sb = new StringBuffer("Hello");

        System.out.println("buffer = " + sb);
        System.out.println("length = " + sb.length());
        System.out.println("capacity = " + sb.capacity());

        //设置缓冲区的大小
        sb.ensureCapacity(10);

        sb.setLength(1);
        System.out.println("buffer = " + sb);
    }
}
