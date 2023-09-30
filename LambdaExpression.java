@FunctionalInterface
interface LambdaEx{
    void show(int i);
}
public class LambdaExpression {
    public static void main(String[] args) {
        //-------default----------
        // LambdaEx obj = ()->System.out.println("in show");
        //---------parameter-----------
        // LambdaEx obj = (int i)->System.out.println("in show");
        //or---
        // LambdaEx obj = (i,j)->System.out.println("in show"+j+i);
        //or-----single variable only------
        LambdaEx obj = i ->System.out.println("in show "+i);
        obj.show(8);
    }
}
