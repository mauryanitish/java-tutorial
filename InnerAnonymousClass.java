class Example{
    public void show(){
        System.out.println("in class A show");
    }
}
public class InnerAnonymousClass {
    public static void main(String[] args) {
        Example obj = new Example()
        {
            public void show(){
                System.out.println("in new show");
                config();
            }
            public void config(){
                System.out.println("in config");
            }
        };
        obj.show();
        
    }
}
