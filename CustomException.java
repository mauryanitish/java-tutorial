class Nitish extends Exception
{
    public Nitish(String str){
        super(str);
    }
}
public class CustomException {
    public static void main(String[] args) {
        int i =20;
        int j = 0;
        try {
            j = 18/i;
            if(j==0)
                throw new Nitish("I am not want to print zero");
        }
        catch(Nitish e){
            j=18/1;
            System.out.println("Default value is printing "+e);
        }
        catch(Exception e){
            System.out.println("Something went wrong "+e);
        }
        System.out.println(j);

    }
}
