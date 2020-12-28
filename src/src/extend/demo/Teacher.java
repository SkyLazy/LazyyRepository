package src.extend.demo;

public class Teacher extends Person{
    private static final String TYPE = "Teacher";
    public static String getType(){
        return TYPE;
    }
    //继承父类后，构造函数会隐式的调用父类的无参的构造函数，或者显示的调用有参构造函数，如果不存在无参构造函数且又不手动调用有参构造函数，则子类会初始化失败
    Teacher(String name){
        //如果子类中构造器的第一行写了this();，则就隐式的super();会消失，因为super()和this()都只能在构造器的第一行定义
        //this(name);会报错
        super(name);//此处删除会编译报错，因为Teacher类中没有无参函数
        System.out.println("Teacher init！");
    }


}
