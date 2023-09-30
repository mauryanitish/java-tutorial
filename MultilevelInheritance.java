
/**
 * multilevel inheritance using in which class AdvanceCalc extends Calc class 
 * VeryAdvanceCalc extend Advance Calc 
 * Calc <--- AdvanceCalc <--- VeryAdvanceCalc. 
 */
import java.util.Scanner;

class VeryAdvanceCalc extends AdvanceCalc {
    public double power(int num1, int num2) {
        return Math.pow(num1, num2);
    }
}

public class MultilevelInheritance {
    public static void main(String[] args) {
        VeryAdvanceCalc va = new VeryAdvanceCalc();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the two numbers");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int a = va.add(num1, num2);
        int s = va.sub(num1, num2);
        int m = va.multi(num1, num2);
        int d = va.division(num1, num2);
        int sq = va.squareRoot(num1);
        double p = va.power(num1, num2);
        System.out.println(a + " " + s + " " + m + " " + d + " " + sq + " " + p);
        sc.close();
    }
}
