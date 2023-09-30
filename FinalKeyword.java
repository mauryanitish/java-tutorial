class First{
    public final void show(){
        System.out.println("present in first class show method");
    }
    public void config(){
        System.out.println("in second class");
    }
}

final class second extends First{
    // public void show(){
    //     System.out.println("present in second class show method");
    // }
    /*show method not overriding because class first using final keyword in show method */

    public void config(){
        System.out.println("in second class");
    }
} 

class Third //not extends Second class. because Second class is final 
{
    public void show(){
        System.out.println("present in third class show");
    }
}
public class FinalKeyword {
    public static void main(String[] args) {
        final float pi = 3.14f;
        // pi = 3.22f; //not change because final variable
        First obj = new First();
        obj.show();
        obj.config();
    }
}
