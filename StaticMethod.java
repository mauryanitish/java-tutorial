class Mobile{
    String brand;
    int price;
    static String name;

    public static void show(Mobile obj){
        System.out.println(obj.brand+" "+obj.price+" "+name);
        // System.out.println(name);
    }
}

public class StaticMethod {
    public static void main(String[] args) {
        Mobile obj1 = new Mobile();
        obj1.brand = "Apple";
        obj1.price = 23000;
        Mobile.name = "Smart Phone";

        Mobile.show(obj1);
    }
    
}
