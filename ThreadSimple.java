class One extends Thread{
    public void run(){
        for(int i = 0; i < 100; i++)
        {
            System.out.println("Hi");
        }
    }
}
class Second extends Thread{
    public void run(){
        for(int i = 0; i < 100; i++)
        {
            System.out.println("Hello");
        }
    }
}
public class ThreadSimple {
    public static void main(String[] args) {
        One o = new One();
        Second s = new Second();

        o.start();
        s.start();
    }
}
