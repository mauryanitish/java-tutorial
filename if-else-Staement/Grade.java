/**A school has following rules for grading system:
a. Below 25 - F
b. 25 to 45 - E
c. 45 to 50 - D
d. 50 to 60 - C
e. 60 to 80 - B
f. Above 80 - A
Ask user to enter marks and print the corresponding grade. */
import java.util.Scanner;
public class Grade {
    public static void main(String arg[]){
        Scanner s = new Scanner(System.in);
        char grade;
        System.out.println("Enter the total marks out of 100 :");
        double marks = s.nextDouble();
        if(marks>80 && marks<=100)
            grade='A';
        else if(marks>60 && marks<=80)
            grade='B';
        else if(marks>50 && marks<=60)
            grade='C';
        else if(marks>45 && marks<=50)
            grade='D';
        else if(marks>25 && marks<=45)
            grade='E';
        else if(marks>=0 && marks<=25)
            grade='F';
        else{
            grade='F';
            System.out.println("Your marks is lessthan 0 or morethan 100");
        }
        
        System.out.println("Your marks are "+marks+"according to grade "+grade);
        s.close();
    }
}
