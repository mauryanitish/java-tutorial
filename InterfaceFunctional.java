@FunctionalInterface
interface Simple{
    void show();
    // void run();
}
public class InterfaceFunctional {
    public static void main(String[] args) {
        Simple si = new Simple() {
            public void show(){
                System.out.println("in show");
            }
        };
        si.show();
    }
}
