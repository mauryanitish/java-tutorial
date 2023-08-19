import java.util.Scanner;
class CheckNum{
    public String CheckEvenOdd(int num){
        if(num%2 == 0)
            return "even";
        return "odd";
    }
}
public class EvenOdd {
    public static void main(String args[]){
        Scanner s  = new Scanner(System.in);
        CheckNum check = new CheckNum();
        System.out.println("Enter the number : ");
        int num = s.nextInt();
        String str = check.CheckEvenOdd(num);
        System.out.println(num+" is "+str);
        s.close();
    }
}
