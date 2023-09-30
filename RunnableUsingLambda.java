public class RunnableUsingLambda {
    public static void main(String[] args) {
        Runnable o1 = () -> {//Anonymous and lambda expression use
            for (int i = 0; i < 10; i++) {
                System.out.println("Hi");
                try {
                    Thread.sleep(5);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        Runnable o2 = () -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("Hello");
                try {
                    Thread.sleep(5);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        Thread t1 = new Thread(o1);
        Thread t2 = new Thread(o2);
        t2.start();
        t1.start();
    }
}
