public class MultipleExceptionCatches {
    public static void main(String[] args) {
        int i = 02;
        int j = 0;
        int arr[] = new int[5];
        String s = null;
        try{
            j= 20/i;
            System.out.println(s.length());
            System.out.println(arr[1]);
            System.out.println(arr[5]);
        }
        catch(ArithmeticException e){
            System.out.println("Cannot divided by zero");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("you access out of lenght");
        }
        catch(Exception e){
            System.out.println("Something went wrong....");
        }
        System.out.println(j);
        System.out.println("bye");
    }
}
