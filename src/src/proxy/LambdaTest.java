package src.proxy;

public class LambdaTest {
    public static void main(String[] args) {
        //Lambda表达式
        Speaker speaker = ()->{ System.out.println("1111");};//使用Lambda表达式，由于Speaker是函数接口，故自动推断要执行speak()方法；
        speaker.speak();
    }
}
