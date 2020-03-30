package src.threaddemo;

public class MainThread {
    public static void main(String[] args) {
        try {
            Thread.sleep(2000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread());
        System.out.println("main thread sleep over!");

    }
}
