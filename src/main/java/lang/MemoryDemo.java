package lang;

/**
 * Created by ZSH
 */
public class MemoryDemo {
    public static void main(String args[]) {
        Runtime r = Runtime.getRuntime();
        long mem1, mem2;
        Integer someints[] = new Integer[10000];

        System.out.println("Total memory is: " + r.totalMemory());
        mem1 = r.freeMemory();
        System.out.println("Free memory after garbage collection: " + mem1);

        for (int i = 0;i<10000;i++){
            someints[i] = i;
        }

        mem2 = r.freeMemory();
        System.out.println("Free memory after allocation: " + mem2);
        System.out.println("Memory used by allocation: " + (mem1 - mem2));

        for (Integer entity : someints) {
            entity = null;
        }

        r.gc();

        mem2 = r.freeMemory();
        System.out.println("Free memory after collecting discarded Integers: " + mem2);

    }
}
