package src.threadDemo;

public class WaitNotify_demo_2 {
    static int i=0;
    static Thread t1;
    static Thread t2;
    static Object obj = new Object();

    public static void main(String[] args) {
        t1 = new Thread(()->{
         synchronized (obj){
             while(i<10){
                    System.out.println("t1:"+ ++i);
                    obj.notify();
                    try {
                        obj.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                obj.notify();
            }
        });

        t2 = new Thread(()->{

            synchronized (obj){
                while(i<10){
                    System.out.println("t2:"+ ++i);
                    obj.notify();
                    try {
                        obj.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                obj.notify();
            }
        });

        t1.start();;
        t2.start();
    }
}
