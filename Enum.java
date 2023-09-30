enum Status{
    Running,error,Active,Successfull;
}
public class Enum {
    public static void main(String[] args) {
        Status ss = Status.Active;
        System.out.println(ss);
        System.out.println(ss.ordinal());
        Status[] s = Status.values();
        
        for(Status val : s){
            System.out.println(val);
        }
    }
}
