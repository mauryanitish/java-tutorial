/**Take two int values from user and print greatest among them. */
import java.util.Scanner;
public class GreatestTwo {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the first number :");
        int num1 = s.nextInt();

        System.out.println("Enter the ssecond number :");
        int num2 = s.nextInt();

        if(num2 > num1)
            System.out.println("Greater is "+num2);
        else if(num1 == num2)
            System.out.println("Equal both");
        else
            System.out.println("Greater is "+num1);

        s.close();
    }
}
