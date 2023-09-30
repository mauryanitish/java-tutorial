class Bike{
    static String name;
    int price;
    String brand;

    //static block--> it is call at class load time.
    static{
        //there are using only static fields/variable and static method use directly. other are using the obj of class.
        name = "bike";
        System.out.println("is static block call");
    }

    //constructor of class
    public Bike(){
        System.out.println("is constructor call");
    }
    public void show(){
        System.out.println(name+" "+price+" "+brand);
    }
}

class StaticBlock{
    public static void main(String[] args) throws ClassNotFoundException {
        //use class Class to load class in class loader
        Class.forName("Bike");

        //call static variable
        // System.out.println(Bike.name);
        
        //without obj call class are not loaded in class loader so static block are not call
        // Bike bk = new Bike();
        // bk.price = 200000;
        // bk.brand = "Hero";

        // Bike bk1 = new Bike();
        // bk1.price = 32000;
        // bk1.brand = "Honda";
    }
}