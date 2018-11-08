package lang;

/**
 * Created by ZSH
 */
public class TestClone implements Cloneable {
    int a;
    double b;

    TestClone cloneTest(){
        try{
            return (TestClone) super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("Cloning not allowed.");
            return this;
        }
    }

    public Object clone(){
        try {
            return super.clone();
        }catch (CloneNotSupportedException e){
            System.out.println("Cloning not allowed.");
            return this;
        }
    }

}
