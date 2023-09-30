class Race{
    int count;
    public synchronized void inc(){
        count++;
    }
}
public class RaceCondition {
    public static void main(String arg[]) throws InterruptedException{
        Race r = new Race();
        Runnable r1 = ()->{
            for(int i = 0; i<1000; i++){
                r.inc();
            }
        };
        Runnable r2 = ()->{
            for(int i =0; i < 1000; i++){
                r.inc();
            }
        };

        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);
        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(r.count);
    }
}
