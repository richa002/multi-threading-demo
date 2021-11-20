public class Demo2 {
    public static void main(String[] args) {
        Thread t1=new Thread(()-> {

            for(int i=0;i<1000;i++) {
                System.out.println("I am a lazy thread");
              //  Thread.sleep(2000);
            }
            System.out.println("i want to sleep");
           try{
            Thread.sleep(2000);
        }catch (Exception e){
                System.out.println("I got interrupterd");
            }
        });
        t1.start();
        t1.interrupt();
        System.out.println("hi main thread");

    }
}
