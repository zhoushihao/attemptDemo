package other;

import java.util.ArrayList;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Created by ZSH
 */
public class Student {
    private String name;
    private int age;
    private int score;
    private String classNum;

    public Student(String name, int age, int score, String classNum) {
        this.name = name;
        this.age = age;
        this.score = score;
        this.classNum = classNum;
    }

    public static void main(String args[]) {
        List<Student> list = new ArrayList();
        list.add(new Student("Tom", 18, 100, "class05"));
        list.add(new Student("Tom", 18, 100, "class05"));
        list.add(new Student("Jerry", 22, 70, "class04"));
        list.add(new Student("Owen", 25, 90, "class05"));
        list.add(new Student("Jim", 30, 80, "class05"));
        list.add(new Student("Steve", 28, 66, "class06"));
        list.add(new Student("Kevin", 24, 100, "class04"));

        System.out.println("平均年龄为：" + list.stream().collect(Collectors.averagingInt(Student::getAge)));

        Map<Student, DoubleSummaryStatistics> map = list.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.summarizingDouble(Student::getScore)));

        map.forEach((k, v) -> System.out.println(k + ":" + v));
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getClassNum() {
        return classNum;
    }

    public void setClassNum(String classNum) {
        this.classNum = classNum;
    }
}
