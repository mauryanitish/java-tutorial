/**Explain constructor */
class Fan{
    private String name;
    private int price;

    //constructor
    public Fan(){
        name = "Jio";
        price = 2300;
        System.out.println("in constructor");
    }
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    
}

public class DefaultConstructor {
    public static void main(String[] args) {
        Fan fn = new Fan();
        Fan fn1 = new Fan();
        System.out.println(fn.getName()+" : "+fn.getPrice());
        fn1.setName("Knight");
        fn1.setPrice(2000);
        System.out.println(fn1.getName()+" : "+fn1.getPrice());
    }
}
