package genericity;

/**
 * Created by ZSH
 */
public class MyClass2 {
    private String str;

    MyClass2(String s) {
        str = s;
    }

    MyClass2() {
        str = "";
    }

    String getStr() {
        return str;
    }

}
