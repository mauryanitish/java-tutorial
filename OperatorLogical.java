/**There are show Logical operators */
public class OperatorLogical{
    public static void main(String args[]){
        int x = 9;
        int y = 7;
        int a = 4;
        int b = 2;

        System.out.println((x>y)&&(a<b));
        System.out.println((x<y)&&(a<b));
        System.out.println((x>y)&&(a>b));
        System.out.println();
        System.out.println((x>y)||(a<b));
        System.out.println((x<y)||(a<b));
        System.out.println((x>y)||(a>b));
        System.out.println();
        boolean result = (a<x)||(y>b);
        System.out.println(result);
        System.out.println(!result);
    }
}