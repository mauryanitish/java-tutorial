/**Write a program to print absolute vlaue of a number entered by user. E.g.-
INPUT: 1        OUTPUT: 1
INPUT: -1        OUTPUT: 1 */
import java.util.Scanner;
public class AbsoluteValue {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the number : ");
        int num = s.nextInt();
        if(num<=0)
            num=0-num;
        System.out.println("your value is "+num);
        s.close();
    }
}
