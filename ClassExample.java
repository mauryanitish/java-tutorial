class Calculator {
    public int add(int n1, int n2) {
        return n1 + n2;
    }
}

public class ClassExample {
    public static void main(String args[]) {
        int num1 = 8;
        int num2 = 9;
        // create obj
        Calculator calc = new Calculator();
        int result = calc.add(num1, num2);
        System.out.print(result);
    }
}
