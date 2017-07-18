package java8_practice.base.interfaceMethod;

import other.SortByMoreCondition;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Created by zsh on 2017/7/18 0018.
 */
public class CollectorsGroupBy {

    public static void main (String args[]){
        List<SortByMoreCondition> list = Arrays.asList(
                new SortByMoreCondition("0001", 1, 1000, 20),
                new SortByMoreCondition("0002", 1, 2000, 30),
                new SortByMoreCondition("0003", 1, 2000, 40),
                new SortByMoreCondition("0004", 2, 1000, 10),
                new SortByMoreCondition("0004", 2, 1000, 10));
        Map<String, Long> counting = list.stream().collect(
                Collectors.groupingBy(SortByMoreCondition::getId, Collectors.counting()));
        System.out.println(counting);

        Map<String,Integer> sum = list.stream().collect(Collectors.groupingBy(SortByMoreCondition::getId,Collectors.summingInt(SortByMoreCondition::getSalary)));
        System.out.println(sum);
    }
}
