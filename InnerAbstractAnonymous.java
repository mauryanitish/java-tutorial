/**
 * Abstract and Anonymous inner class  implimentation
 */
abstract class Example{
    public abstract void show();
    static class CreateNew{
        public void show(){
            System.out.println("in CreateNew class");
        }
    }
}
// class C extends Example{
//     public void show(){
//         super();
//         System.out.println("in");
//     }
// }
public class InnerAbstractAnonymous {
    public static void main(String[] args) {
        Example.CreateNew obj = new Example.CreateNew();//acces the abstract class

        Example obj1 = new Example() {
            public void show(){
                System.out.println("is new show");
            }
        };
        obj.show();
        obj1.show();

    }   
}
