package src.threadDemo;

public class ThreadState_Sleep {
    static boolean running = true;
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(()->{
            while(running){
            }
            try {
                Thread.sleep(10000L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        //新建的线程的状态
        System.out.println(t1.getState());

        t1.start();
        Thread.sleep(1000L);
        //启动后线程的状态
        System.out.println(t1.getState());
        running = false;

        //main线程sleep 1秒，确保t1线程进入sleep状态
        Thread.sleep(1000L);


        //处于sleep状态的t1的state
        System.out.println(t1.getState());
    }
}
