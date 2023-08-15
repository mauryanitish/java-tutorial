/**A shop will give discount of 10% if the cost of purchased quantity is more than 1000.
Ask user for quantity */
import java.util.Scanner;
public class Discount {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the total amount of purchase :");
        double amount = s.nextDouble();

        if(amount>1000)
        {
            double t = (amount*10)/100;
            System.out.println("After Discount of 10% = "+(amount-t));
        }
        else{
            System.out.println("Tatal amount is "+amount);
        }

        s.close();
    }
}
