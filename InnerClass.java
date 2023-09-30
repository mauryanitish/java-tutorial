class Animal{
    public String name;

    public void show(){
        System.out.println("in Animal class");
    }

    class Cat{
        public void speak(){
            System.out.println("cat is speaking ..");
        }
    }
}

public class InnerClass {
    public static void main(String[] args) {
        Animal an = new Animal();
        an.name = "cat";
        an.show();
        Animal.Cat c = an.new Cat();// for simple class
        // Animal.Cat c = new Animal.Cat();// for static class
        c.speak();
    }
}
