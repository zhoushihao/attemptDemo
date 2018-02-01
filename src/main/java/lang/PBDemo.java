package lang;

/**
 * Created by ZSH
 */
public class PBDemo {
    public static void main(String args[]) {
        try {
            ProcessBuilder proc = new ProcessBuilder("notepad.exe", "test-file");
            proc.start();
        } catch (Exception e) {
            System.out.println("Error executing notepad");
        }
    }
}
