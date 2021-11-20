import org.omg.PortableServer.THREAD_POLICY_ID;

public class Demo1 {
    public static void main(String[] args) {
        Thread t1=new Thread(()->{
           for(int i=0;i<5;i++)
               System.out.println("Child Thread "+i);
           Thread.yield();
        });
        t1.start();

        for(int i=0;i<5;i++){
           // Thread.yield();
            System.out.println("Main thread "+i);
           // Thread.yield();
        }
    }
}
