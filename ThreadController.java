class One2 extends Thread{
    public void run(){
        for(int i = 0; i < 100; i++){
        System.out.println("Hi");
        try {
            Thread.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        }
    }
}
class Second2 extends Thread{
    public void run(){
        for(int i = 0; i < 100; i++){
        System.out.println("Hello");
        try {
            Thread.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        }
    }
}
public class ThreadController {
    public static void main(String[] args) {
        One2 o = new One2();
        Second2 s = new Second2();
        //Check priority
        System.out.println(o.getPriority());
        System.out.println(s.getPriority());
        //set priority
        o.setPriority(Thread.MAX_PRIORITY);

        o.start();
        try{
            Thread.sleep(5);
            System.out.println("main");
        }
        catch(InterruptedException e){
            System.out.println(e);
        }
        s.start();

    }
}
