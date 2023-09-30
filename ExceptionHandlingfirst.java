public class ExceptionHandlingfirst {
    public static void main(String[] args) {
        // int i =0;
        int i = 6;
        int j =0;
        try{//in this block write statement they crreate in future runtime error or exceptions
            j = 48/i;
        }
        catch(Exception e){
            //in this block write statements exicuted when try block return the exception to exception class
            System.out.println("Something went wrong...");
        }
        System.out.println(j);
        System.out.println("bye");
    }
}
