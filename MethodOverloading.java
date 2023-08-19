class Calculator{
    public int add(int a, int b){
        return a+b;
    }
    public int add(int a, int b, int c){
        return a+b+c;
    }
    public double add(double a,int b, double c){
        return a+b+c;
    }
}
public class MethodOverloading{
    public static void main(String arg[]){
        Calculator calc = new Calculator();
        System.out.println(calc.add(5,7));
        System.out.println(calc.add(5,7,4));
        System.out.println(calc.add(5.9,7,4));
    }
}