package lang;

/**
 * Created by ZSH
 */
public class ExecDemo {
    public static void main(String args[]) {
        Runtime r = Runtime.getRuntime();
        Process p = null;

        try {
            p = r.exec("notepad");
            System.out.println(p);
        } catch (Exception e) {
            System.out.println("Error executing notepad.");
        }
    }
}
