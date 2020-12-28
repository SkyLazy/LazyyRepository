package src.jdk8_test;

import java.util.*;

public class Jdk8LambdaTest {


    public static void main(String[] args) {

        //distinct 去重
        List<Integer> listInt = new ArrayList<>();
        listInt.add(0);
        int k = 0;
        while(k<5){
            listInt.add(k++);
        }
        listInt.forEach(System.out::println);
        //System.out:println 方法引用
        listInt.stream().distinct().forEach(System.out::println);

        List<Map<String,String>> list = new ArrayList<>();

        while(list.size()<3){
            Map<String,String> map = new HashMap<>();
            map.put("A"+list.size(),String.valueOf(map.size()));
            map.put("B"+list.size(),String.valueOf(map.size()));
            map.put("C"+list.size(),String.valueOf(map.size()));
            list.add(map);
        }
        list.forEach(System.out::println);
        //filter会过滤不符合表达式里面的元素
        list.stream().distinct().filter(map->"0".equals(map.get("A0"))).forEach(System.out::println);


    }
}
