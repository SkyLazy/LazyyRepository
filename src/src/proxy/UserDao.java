package src.proxy;

public class UserDao implements IUserDao,Speaker{

    private int age;
    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UserDao(){

    }

    private UserDao(int _age,String _name){
        this.age=_age;
        this.name=_name;
    }

    @Override
    public void save() {
        System.out.println("saving ...");
    }

    @Override
    public void speak() {
        System.out.println("Chinese");
    }
}
