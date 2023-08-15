/**
A student will not be allowed to sit in exam if his/her attendence is less than 75%.
Take following input from user
Number of classes held
Number of classes attended.
And print
percentage of class attended
Is student is allowed to sit in exam or not. */
import java.util.Scanner;
public class Attendance {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the total classes held :");
        int held = s.nextInt();
        System.out.println("Enter the total classes attended :");
        int attended = s.nextInt();

        int percentage = (attended*100)/held;
        if(percentage>=75)
            System.out.println("You are allowed to sit in exam");
        else
            System.out.println("You are not allowed to sit in exam");
        s.close();
    }
}
