public class ThisMethod {
    public static void main(String[] args) {
        Bb b = new Bb(3);
    }
}
class Aa{
    public Aa(){
        System.out.println("in Aa");
    }
}
class Bb extends Aa{
    public Bb(){
        super();
        System.out.println("in Bb");
    }
    public Bb(int n){
        this();
        System.out.println("in Bb n");
    }
}
