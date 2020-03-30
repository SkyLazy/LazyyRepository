package src;

/**
 * 参数传递
 */
public class ParamterPass {
    private String obj = "ParamterPass";

    public static void main(String[] args) {
        ParamterPass ps = new ParamterPass();
        String str = "old String";
        Integer a = new Integer(5);
        ps.VaildPass(ps,str,a);
        System.out.println(ps.obj);
        System.out.println(str);
        System.out.println(a);
        //“引用传递”，也叫做传地址，即方法操作参数变量时是拷贝了变量的引用，注意传递给方法的参数为变量的引用，其实也就是指针，而后通过这个引用找到变量（在这里是对象）的真正地址，并对其进行操作就会改变原有值
        System.out.println(System.identityHashCode(ps.obj));
        //是引用传递，但是由于String类的实现是有final char[]数据组进行保存，所以在再给变量赋值新值时都会重新创建一个string实例（这个新创建的string实例所指向的地址和外部string变量所指向的地址是不同的所以改变不了外部的变量）另外一个点说明因为final  String 对象是不可变的
        System.out.println(System.identityHashCode(str));
        //“值传递” ，即方法操作的是参数变量（也就是原型变量的一个值的拷贝）改变的也只是原型变量的一个拷贝而已，而非变量本身。所以变量原型并不会随之改变
        System.out.println(System.identityHashCode(a));
    }

    public void VaildPass(ParamterPass paramterPass,String str ,Integer a){
        paramterPass.obj = "CParamterPass";
        str = "new String";
        a =a + 1;
        System.out.println(System.identityHashCode(paramterPass.obj));
        System.out.println(System.identityHashCode(str));
        System.out.println(System.identityHashCode(a));
    }
}
