package src.proxy;

public class test {
    public static void main(String[] args){
        IUserDao proxy = new UserProxy(new UserDao());
        proxy.save();

        IUserDao ud = new UserDao();
        ProxyFactory pf = new ProxyFactory(ud);
        IUserDao proxy1 = (IUserDao)pf.getProxyInstance();
        Speaker proxy2 = (Speaker)pf.getProxyInstance();
        proxy1.save();

    }
}
