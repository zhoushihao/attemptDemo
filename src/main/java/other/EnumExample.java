package other;

/**
 * Created by ZSH
 */
public enum EnumExample {
    CLASS_a(1,"一班"),
    CLASS_b(2,"二班");

    private Integer number;
    private String name;

    EnumExample(int number,String name){
        this.number = number;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }
    public static void main (String args[]){
    EnumExample e1 = EnumExample.CLASS_a;
    EnumExample e2 = EnumExample.CLASS_b;
    System.out.println(e1.name()+":"+e1.getName());
    System.out.println(e2.number+":"+e2.name);
    }
}
