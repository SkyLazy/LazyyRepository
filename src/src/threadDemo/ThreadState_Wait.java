package src.threadDemo;

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
                    System.out.println("t1 将 执行完");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        t1.start();
        Thread.sleep(1000L);

        System.out.println("t1执行t1将wait（3000L）时候的状态："+ t1.getState());
    }
}
