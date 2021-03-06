package genericity;

/**
 * Created by ZSH
 */
public class WildcardDemo {
    public static void main(String args[]) {
        Integer inums[] = {1, 2, 3, 4, 5};
        Stats<Integer> iob = new Stats<>(inums);
        double v = iob.average();
        System.out.println("iob average is " + v);

        Double dnums[] = {1.1, 2.2, 3.3, 4.4, 5.5};
        Stats<Double> dob = new Stats<>(dnums);
        double w = dob.average();
        System.out.println("dob average is " + w);

        Float fnums[] = {1.0F, 2.0F, 3.0F, 4.0F, 5.0F};
        Stats<Float> fob = new Stats<>(fnums);
        double x = fob.average();
        System.out.println("fob average is " +x);

        System.out.println("Average of iob and dob ");
        if (iob.sameAvg(dob)){
            System.out.println("SAME");
        }else {
            System.out.println("DIFFER");
        }

        if (iob.sameAvg(fob)){
            System.out.println("SAME");
        }else {
            System.out.println("DIFFER");
        }

    }
}
