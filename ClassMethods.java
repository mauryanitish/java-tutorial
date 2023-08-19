class Computer{
    public void music(){
        System.out.println("Music Playing ...");
    }
    public String pen(int cost){
        if(cost>=10)
            return "pen";
        return "nothing";
    }
}
public class ClassMethods {
    public static void main(String [] args){
        Computer com = new Computer();
        com.music();
        String str = com.pen(9);
        System.out.println(str);
    }
}
