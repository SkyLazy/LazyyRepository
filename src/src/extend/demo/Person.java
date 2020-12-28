package src.extend.demo;

public class Person {
    private static final String TYPE = "human";

    public static String getType() {
        return TYPE;
    }

    private String name;

    public String getName() {
        return this.name;
    }

    Person(String name) {
        System.out.println(name + TYPE + "init!");
    }
}
