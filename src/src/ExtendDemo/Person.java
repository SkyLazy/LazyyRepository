package src.ExtendDemo;

public class Person {
    private static String type ="human";

    public static String getType(){
        return type;
    }

    private String name;

    public String getName(){
        return this.name;
    }

    Person(String name){
        System.out.println("Person init!");
    }
}
