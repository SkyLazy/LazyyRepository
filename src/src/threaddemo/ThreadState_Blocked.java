package src.threaddemo;

public class ThreadState_Blocked {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread (()->{
            synchronized (ThreadState_Blocked.class){
                System.out.println("t1 get the locker!");
            }
        });

        synchronized (ThreadState_Blocked.class){
            t1.start();
            Thread.sleep(1000L);
            System.out.println("t1 doesn't get the locker:"+t1.getState());
        }
    }
}
