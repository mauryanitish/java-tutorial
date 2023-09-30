
/**
 * Inheritance --> one class inherit or extends all the methods and fields from
 * one class to another
 */
import java.util.Scanner;

// calc class
class Calc {
    public int add(int a, int b) {
        return a + b;
    }

    public int sub(int a, int b) {
        return a - b;
    }

    public int multi(int a, int b) {
        return a * b;
    }

    public int division(int a, int b) {
        return a / b;
    }

}

// advance calc class
class AdvanceCalc extends Calc {
    public int modulo(int a, int b) {
        return a % b;
    }

    public int squareRoot(int a) {
        return a * a;
    }

    public int cubeRoot(int a) {
        return a * a * a;
    }
}

// main class
class Inheritance {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Calc c = new AdvanceCalc();
        int result = 0;
        System.out.println("A for simple calculation");
        System.out.println("B for advance calculation");
        char ch = s.next().charAt(0);
        if (ch == 'A' || ch == 'a') {
            System.out.println("Enter the two numbers : ");
            int num1 = s.nextInt();
            int num2 = s.nextInt();
            System.out.println("+ , - , /, * choice the option");
            char op = s.next().charAt(ch);
            result = switch (op) {
                case '+' -> c.add(num1, num2);
                case '-' -> c.sub(num1, num2);
                case '*' -> c.multi(num1, num2);
                case '/' -> c.division(num1, num2);
                default -> 0;
            };
        } else if (ch == 'B' || ch == 'b') {
            System.out.println("Enter the numbers : ");
            int num1 = s.nextInt();
            System.out.println("S for sqrroot, C for cuberoot");
            char op = s.next().charAt(0);
            result = switch (op) {
                case 'c', 'C' -> num1 * num1 * num1;
                case 's', 'S' -> num1 * num1;
                default -> 0;
            };
        } else {
            System.out.println("you are click wrong option");
        }
        System.out.println("Result : " + result);
        s.close();
    }
}