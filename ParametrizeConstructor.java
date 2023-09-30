class Paint{
    private String name;
    private int price;

    //Default constructor
    public Paint(){
        name = "Asian";
        price = 2050;
        System.out.println("default constructor");
    }

    //Parametrise constructor
    public Paint(String name, int price){
        this.name = name;
        this.price = price;
        System.out.println("parametrize constructor");
    }
    //parametrise constructor
    public Paint(String name){
        this.name = name;
        this.price = 2300;
        System.out.println("parametrize constructor");
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setPrice(int price){
        this.price = price;
    }
    public int getPrice(){
        return price;
    }

}

public class ParametrizeConstructor {
    public static void main(String[] args) {
        Paint p3 = new Paint("Indico");
        Paint p1 = new Paint();
        Paint p2 = new Paint("Dulex",3000);
        System.out.println(p1.getName()+" : "+p1.getPrice());
        System.out.println(p2.getName()+" : "+p2.getPrice());
        System.out.println(p3.getName()+" : "+p3.getPrice());
    }
}
