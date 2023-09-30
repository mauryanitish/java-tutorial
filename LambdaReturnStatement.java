@FunctionalInterface
interface ReturnType{
    int add(int i, int j);
}
public class LambdaReturnStatement {
    public static void main(String[] args) {
        ReturnType obj = (i,j) -> i+j;
        int result = obj.add(8,9);
        System.out.println("Add = "+result);
    }
}
