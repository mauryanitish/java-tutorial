enum Laptop{
    MAC(70000),HP(50000),DELL,THINKPAD(40000);

    private int price;
    private Laptop(){
        price = 5000;
    }
    private Laptop(int price){
        this.price = price;
    }
    public int getPrice(){
        return price;
    }
    public void setPrice(int price){
        this.price = price;
    }
}
public class EnumClass {
    public static void main(String[] args) {
        Laptop lap = Laptop.DELL;
        lap.setPrice(5000);//change price using setter
        System.out.println(lap.getClass().getSuperclass());
        System.out.println(lap+" : "+lap.getPrice());
        System.out.println();
        for(Laptop lap1 : Laptop.values()){
            System.out.println(lap1+" : "+lap1.getPrice());
        }
        System.out.println();

    }
}
