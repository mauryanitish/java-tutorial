class Single{
    public void father() throws ArithmeticException
    {
        son();
    }
    public void son() throws ArithmeticException
    {
        int i =0;
        int j = 18/i;
        System.out.println(j);
    }
}
public class DuckingException {
    public static void main(String[] args) {
        Single si = new Single();
        try {
        si.father();
        }
        catch(ArithmeticException e){
            System.out.println("Denominator is zero "+e);
        }
    }
}
