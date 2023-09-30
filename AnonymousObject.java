class AnonymousClass{
    static int a;
    AnonymousClass(){
        System.out.println("In constructor "+a);
    }
    public void show(){
        System.out.println("in show method "+a);
    }
}
public class AnonymousObject {
    public static void main(String[] args) {
        new AnonymousClass();//Anonymous object
        // new AnonymousClass().a=10;
        AnonymousClass.a =102;//access variable
        new AnonymousClass().show();//access method.
    }
}
