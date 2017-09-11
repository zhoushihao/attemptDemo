package other;

/**
 * Created by Administrator on 2017/5/27 0027.
 */
public class BuyPractice {

    public static void main(String[] strings){
        String number = "一斤";
        String command = "下班回来买"+number+"包子";
        System.out.println(command);
        if(meet("看见了西瓜")){
            System.out.println("我看见了西瓜");
            number = "一个";
        }
        command = "下班回来买"+number+"包子";
        System.out.print(command);
    }

    static boolean meet (String see){
        return see.equals("看见了西瓜");
    }
}
