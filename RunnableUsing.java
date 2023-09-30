class One implements Runnable{
    public void run(){
        for(int i = 0; i < 10; i++){
        System.out.println("Hi");
        try {
            Thread.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        }
    }
}
class Second implements Runnable{
    public void run(){
        for(int i = 0; i < 10; i++){
        System.out.println("Hello");
        try {
            Thread.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        }
    }
}
public class RunnableUsing {
    public static void main(String[] args) {
        One o = new One();
        Second s = new Second();

        Thread t1 =new Thread(o);
        Thread t2 =new Thread(s);
        
        t1.start();
        t2.start();
    }
}
