/**
 * Method overriding
 */
class X{
    public void show(){
        System.out.println("in class X show method");
    }
    public void config()
    {
        System.out.println("in class X config method");
    }
}

class Y extends X{
    //show() method overriding 
    public void show(){
        System.out.println("in class Y show method");
    }
}
public class MethodOverriding {
    public static void main(String[] args) {
        Y obj = new Y();
        obj.show();
        obj.config();        
    }
}
