/**A company decided to give bonus of 5% to employee if his/her year of service is more than 5 years.
Ask user for their salary and year of service and print the net bonus amount. */
import java.util.Scanner;
public class Bonus {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the Salary of year : ");
        double salary = s.nextDouble();
        System.out.println("Enter the year of service :");
        double year = s.nextDouble();
        if(year>5){
            double b = (salary*5)/100;
            System.out.println("Bonus :"+b);
        }
        else{
            System.out.println("Your service of year is lessthan 5 years");
        }
        s.close();
    }
}
