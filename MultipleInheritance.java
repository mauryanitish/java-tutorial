interface M1{
    void show();
}
interface M2{
    void config();
}
class See implements M1,M2{//multiple inheritance
    public void show(){
        System.out.println("in show");
    }
    public void config(){
        System.out.println("in config");
    }
}
public class MultipleInheritance {
    public static void main(String[] args) {
        // M1 obj;
        See obj = new See();
        obj.show();
        obj.config();
    }
}
