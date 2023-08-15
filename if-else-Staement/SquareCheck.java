/**Take values of length and breadth of a rectangle from user and check if it is square or not. */
import java.util.Scanner;
public class SquareCheck {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        
        System.out.println("Enter the lenght :");
        int lenght = s.nextInt();

        System.out.println("Enter the breadth :");
        int breadth = s.nextInt();

        if(lenght == breadth)
            System.out.println("It is Square.");
        else
            System.out.println("It is Rectangle.");

        s.close();
     }
}
