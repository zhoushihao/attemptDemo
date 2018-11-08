package lambda;

/**
 * Created by ZSH
 */
public class LambdaDemo {
    public static void main(String args[]) {
        MyNumber myNum= () -> 123.45;
        System.out.println(myNum.getValue());

        myNum = () -> Math.random() * 100;
        System.out.println("AA random value: " + myNum.getValue());
        System.out.println("Another random value: " + myNum.getValue());
    }
}
