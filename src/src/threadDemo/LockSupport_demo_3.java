package src.threadDemo;

import java.util.concurrent.locks.LockSupport;

public class LockSupport_demo_3 {
    static int i = 0;
    static Thread t1;
    static Thread t2;
    static Thread t3;

    public static void main(String[] args) {
        t1 = new Thread(()->{
            while (i<10){
                System.out.println("t1:"+ ++i);
                LockSupport.unpark(t2);
                LockSupport.park();
            }
        });

        t2 = new Thread(()->{
            while (i<10){
                LockSupport.park();
                System.out.println("t2:"+ ++i);
                LockSupport.unpark(t3);
            }
        });

        t3 = new Thread(()->{
            while (i<10){
                LockSupport.park();
                System.out.println("t3:"+ ++i);
                LockSupport.unpark(t1);
            }
        });

        t1.start();
        t2.start();
        t3.start();
    }
}
