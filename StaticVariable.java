class Student{
    int rollNo;
    String name;
    static String sClass="BCA";
}

public class StaticVariable {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Nitish";
        s1.rollNo = 2;
        Student.sClass = "BCA";

        
        Student s2 = new Student();
        s2.name = "Anurag";
        s2.rollNo = 1;
        Student.sClass = "BA";
        
        Student s3 = new Student();
        s3.name = "Rupesh";
        s3.rollNo = 3;
        // Student.sClass = "BCA";
        System.out.println(s2.name+" "+s2.rollNo+" "+Student.sClass);
        System.out.println(s3.name+" "+s3.rollNo+" "+Student.sClass);
        System.out.println(s1.name+" "+s1.rollNo+" "+Student.sClass);


    }
    
}
