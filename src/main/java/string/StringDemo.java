package string;

/**
 * Created by ZSH
 */
public class StringDemo {
    public static void changeStr(String str){
        str="aa";
    }

    public static void main (String args[]){
        String str = "bb";
        changeStr(str);
        System.out.println(str);
    }
}
