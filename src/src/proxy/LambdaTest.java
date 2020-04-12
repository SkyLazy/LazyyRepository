package src.proxy;

import java.util.Arrays;
import java.util.List;

public class LambdaTest {

    public static void foreachTest() {
        List<String> skills = Arrays.asList("java", "golang", "c  ", "c", "python");
        // 使用 Lambda 之前
        for (String skill : skills) {
            System.out.print(skill + ",");
        }
        System.out.println();
        // 使用 Lambda 之后
        // 方式1,forEach lambda
        skills.forEach((skill) -> System.out.print(skill + ","));
        System.out.println();
        // 方式2，forEach 方法引用
        skills.forEach(System.out::print);
    }

    public static void main(String[] args) {
        foreachTest();

        //Lambda表达式
        //使用Lambda表达式，由于Speaker是函数接口，故自动推断要执行speak()方法；
        Speaker speaker = ()->{ System.out.println("1111");};
        speaker.speak();
    }


}
