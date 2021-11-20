import java.util.ArrayList;

public class Demo {
    public static void main(String[] args) {


        ArrayList list = new ArrayList();


        System.out.println(Thread.currentThread());


        Thread t1 = new Thread(()->{
            System.out.println(Thread.currentThread());
            for(int i=0;i<10;i++){
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Another thread");
            }
        });
        t1.start();
        taskForMainThread();




    }

    public  static void taskForMainThread() {
        for(int i=0;i<10;i++){
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Main Thread ");
        }
    }
}
