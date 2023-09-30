interface Computer{//interface created
    int num = 7;//final and static variable
    void show();//abstract and public method
}
// abstract class Computer{
//     public abstract void show(); ****not using abstract class using interface concept****
// }
class Laptop implements Computer{
    public void show(){
        System.out.println(" coding, compiling, testing");

    }
}
class Desktop implements Computer{
    public void show(){
        System.out.println(" coding, compiling, testing..faster");
    }
}

class Developer{
    public void show(Computer comp){
        comp.show();
    }
}
public class InterfaceUsing {
    public static void main(String[] args) {
        Developer dev = new Developer();
        Laptop lap = new Laptop();
        Desktop desk = new Desktop();
        dev.show(desk);
        dev.show(lap);
        System.out.println(Computer.num);
    }
}
