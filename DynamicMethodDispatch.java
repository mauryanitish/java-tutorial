/**
 * Dynamic Methods Dispatch.
 */
class E{
    public void show(){
        System.out.println("in E show");
    }
}
class F extends E{
    public void show(){
        System.out.println("in F show");
    }
}
class G{
    public void show(){
        System.out.println("in G show");
    }
}
class DynamicMethodDispatch{
    public static void main(String[] args) {
        E obj = new F();
        obj.show();

        obj = new E();
        obj.show();//dynamic method dispatch

        // obj = new G(); //show error
        
        G obj1 = new G();
        obj1.show();
    }
}