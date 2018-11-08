package other;

/**
 * Created by ZSH
 */
public enum EnumExample {
    CLASS_a("一班"),
    CLASS_b("二班");

    private String name;

    EnumExample(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main (String args[]){
    }
}
