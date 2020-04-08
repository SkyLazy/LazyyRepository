package src.threaddemo.volatiledemo;

public class Maintest {
public static volatile int race = 0;

public static void increase() {
        race++;
        }

public static synchronized void increase1() {
        race++;
        }

private static final int THREADS_COUNT = 20;

public static void main(String[] args) {

        Thread[] threads = new Thread[THREADS_COUNT];
        for (int i = 0; i < THREADS_COUNT; i++) {
        threads[i] = new Thread(() -> {
        for (int j = 0; j < 10000; j++) {
        increase1();
        }
        });
        threads[i].start();
        }
        while (Thread.activeCount() > 1) {
        Thread.yield();
        }
        System.out.println(race);
        }
        }
