public class SuperMethod {
    public static void main(String[] args) {
        B b = new B();
    }
}
class A//extend default Object class
{
    public A(){
        //super()
        super();
        System.out.println("in A");
    }
    public A(int n){
        super();
        System.out.println("in A int");
    }
}
class B extends A{
    public B(){
        super(3);
        System.out.println("in B");
    }
    public B(int n){
        super(n);
        System.out.println("in B int");
    }
}
