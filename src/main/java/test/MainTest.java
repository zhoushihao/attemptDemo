package test;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by ZSH
 */
public class MainTest {
    public static void main (String args[]){
        TestA a = new TestA("AAAAA","aaaaa");
        TestA b = new TestA("BBBBB","bbbbb");

        List<TestA> testAList = new LinkedList<>();
        testAList.add(a);
        testAList.add(b);

        System.out.println(testAList.stream().map(entity->entity.getA()+entity.getB()).collect(Collectors.joining("\r\n")));
    }
}
