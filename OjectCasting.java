/**object casting
 * Upcasting - it is done in implicitly child class obj convert to parent class obj
 * Downcasting - it is done in explicitly parent class obj convert to child class obj.
 */
class Parent{
    public void show1(){
        System.out.println("in parent");
    }
}
class Child extends Parent{
    public void show(){
        System.out.println("in child");
    }
}
public class OjectCasting {
    public static void main(String[] args) {
        //upcasting
        Parent p = new Child();
        p.show1();

        //downcasting
        Child c = (Child)p;
        c.show();
    }
}
