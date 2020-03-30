package src.threaddemo;

public class ThreadState_Wait {

    public static void main(String[] args) throws InterruptedException {
        Object obj = new Object();

        Thread t1 = new Thread (()->{
            synchronized (obj){
                try {
                    System.out.println("t1将wait 3秒");
                    obj.wait(3000L);
                    System.out.println("t1将wait");
                    obj.wait();
                    System.out.println("t1执行完毕");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        t1.start();
        //确保t1进入wait(3000L)方法
        Thread.sleep(1000L);

        System.out.println("t1执行t1将wait（3000L）时候的状态："+ t1.getState());
        //确保t1进入wait()方法
        Thread.sleep(3000L);

        System.out.println("t1执行wait()方法时候的状态:"+t1.getState());

        //释放锁资源
        synchronized (obj){
            obj.notify();
        }
        System.out.println("t1.notify()后的状态"+t1.getState());

        Thread.sleep(1000L);//确保t1能运行结束，不做此操作，t1可能会出 BLOCKED...
        System.out.println("t1后的状态"+t1.getState());
    }
}
