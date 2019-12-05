package src.proxy;

public class UserProxy implements IUserDao{
    IUserDao target;


    public UserProxy(IUserDao target){
        this.target = target;
    }

    @Override
    public void save(){
        System.out.println("reponsing ...");
        target.save();
        System.out.println("done...");
    }
}
