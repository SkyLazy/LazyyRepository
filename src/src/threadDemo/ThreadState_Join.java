package src.threadDemo;

/**
 * 线程 join 状态的解释
 */
public class ThreadState_Join {

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(()->{
            try {
                Thread.sleep(10000L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("t1 finished!");
        });

        Thread t2 = new Thread(()->{
            try {
                System.out.println("线程t2中执行t1.join（5000L)");
                t1.join(5000L);
                System.out.println("线程t2中执行t1.join（)");
                t1.join();
                System.out.println(t1.getState());
                System.out.println("t2 finished!");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        t1.start();
        t2.start();

        Thread.sleep(1000L);//确保此时t2在执行t1.join(5000L);
        System.out.println("t2在执行t1.join（5000L)时的状态："+ t2.getState());
        Thread.sleep(5000L);//确保此时t2在执行t1.join();
        System.out.println("t2在执行t1.join（)时的状态："+ t2.getState());
    }
}
