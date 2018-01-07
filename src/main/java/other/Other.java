package other;

import java.net.Socket;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;

/**
 * Created by ZSH
 */
public class Other {
    public static void main(String args[]) throws InterruptedException {
        final List<Callable<Object>> c = new LinkedList<>();
        for (int i = 254; i >= 2; i--) {
            final int temp = i;
            c.add(Executors.callable(() -> {
                try {
                    final Socket socket = new Socket("192.168.0." + temp, 80);
                    System.out.println(temp);
                } catch (final Exception ignored) {
                    ignored.printStackTrace();
                }
            }));
        }

        Executors.newFixedThreadPool(255).invokeAll(c);
    }

}
