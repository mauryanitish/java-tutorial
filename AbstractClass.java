abstract class Dog{//abstract class
    public abstract void power();//abstract method
    public void bark(){
        System.out.println("Dog is barking");
    }
}
class BullDog extends Dog{//Concreate class
    public void power(){//compulsory to define abstract method in child class
        System.out.println("is very powerfull");
    }
}
public class AbstractClass {

    public static void main(String[] args) {
        // Dog d = new Dog();//cannot created the object of abstract class
        Dog obj = new BullDog();
        obj.bark();
        obj.power();    
    }
}
