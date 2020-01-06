package src.JDK8Test;

import java.util.*;

public class JDK8LambdaTest {


    public static void main(String[] args) {

        List<Map<String,String>> list = new ArrayList<>();

        while(list.size()<3){
            Map<String,String> map = new HashMap<>();
            map.put("A"+list.size(),String.valueOf(map.size()));
            map.put("B"+list.size(),String.valueOf(map.size()));
            map.put("C"+list.size(),String.valueOf(map.size()));
            list.add(map);
        }



        list.stream().distinct().filter(Mpa->"0".equals(Mpa.get("A0"))).forEach(System.out::println);


    }
}
