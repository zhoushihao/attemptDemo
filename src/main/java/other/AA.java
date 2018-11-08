package other;

/**
 * Created by ZSH
 */
public class AA {
    static {
        System.out.println(1);
    }
    public AA(){
        System.out.println("a");
    }
}
class BB extends AA{
    static {
        System.out.println(2);
    }
    public BB(){
        System.out.println("b");
    }
}
class Hello{
    public static void main (String args[]){
        AA a = new BB();
        BB b = new BB();

        Integer i  = 100;
        Integer j = 100;
        System.out.println(i.equals(j));
    }
}
