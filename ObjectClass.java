//Laptop or other class bydefault extends the object class
class Laptop{
    String brand;
    int price;

    public String toString() {
        return "Laptop [brand=" + brand + ", price=" + price + "]";
    }

}
public class ObjectClass {
    public static void main(String[] args) {
        //laptop class object
        Laptop obj = new Laptop();
        obj.brand = "Lenovo yoga";
        obj.price = 10000;
        System.out.println(obj);
        System.out.println(obj.toString());
        System.out.println(obj.equals(obj));

        //ObjectClass class object
        ObjectClass obj1 = new ObjectClass();
        System.out.println(obj1.toString());
    }
}
