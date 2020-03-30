package src.threaddemo;

public class ThreadCAS_demo_3 {
    static int t=1;
    static int i=0;

    public static void main(String[] args) {
        new Thread(()->{
            while(i<10){
                while(t!=1){

                }
                System.out.println("t1:"+ ++i);
                t=2;
            }

        }).start();

        new Thread(()->{
            while(i<10){
                while(t!=2){

                }
                System.out.println("t2:"+ ++i);
                t=3;
            }

        }).start();

        new Thread(()->{
            while(i<10){
                while(t!=3){

                }
                System.out.println("t3:"+ ++i);
                t=1;
            }

        }).start();

    }
}
