public class ThrowException {
    public static void main(String[] args) {
        int i = 20;
        int j = 0;
        try {
            j = 18/i;
            if(j==0)
                throw new ArithmeticException("result is zero");//throw the catch block when j==0
        }
        catch(ArithmeticException e) {
            j = 18/1;
            System.out.println("default value "+e);
        }
        catch(Exception e){
            System.out.println("Something went wrong.....");
        }
        System.out.println(j);
        System.out.println("good");
    }    
}
