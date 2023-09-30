class Users{
    private String name;
    private int age;
//this --> this keyword refers to the current object of class.
    public void setName(String name){
       this.name = name;
    }
    public String getName(){
        return name;
    }

    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }
}
public class ThisKeyword {
    public static void main(String[] args) {
        Users u1 = new Users();
        u1.setName("Nitish");
        u1.setAge(30);
        System.out.println(u1.getName()+" : "+u1.getAge());
    }
}
