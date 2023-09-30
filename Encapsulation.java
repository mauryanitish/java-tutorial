class Human{
    private String name;
    private int age;

    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }

    public void setNme(String n){
        name = n;
    }
    public void setAge(int a){
        age = a;
    }
}
public class Encapsulation {
    public static void main(String[] args) {
        Human h = new Human();
        h.setNme("Nitish");
        h.setAge(21);
        System.out.println(h.getName()+" : "+h.getAge());
    }
}
