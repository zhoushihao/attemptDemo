package lang;

import java.util.Objects;

/**
 * Created by ZSH
 */
public class ExitDemoFini {
    public static void main(String args[]) {
        Runtime r = Runtime.getRuntime();
        Process p = null;

        try {
            p = r.exec("notepad");
            p.waitFor();
            System.out.println("End");
        } catch (Exception e) {
            System.out.println("Error executing notepad");
        }
        System.out.println("Notepad returned " + Objects.requireNonNull(p).exitValue());
    }
}
