class Student{
    int rollNo;
    String name;
    double marks;
}
public class ArrayOfObject {
    public static void main(String []args){
        Student s1 = new Student();
        s1.name = "Nitish";
        s1.rollNo = 2100;
        s1.marks = 34.6;

        Student s2 = new Student();
        s2.name = "Kumar";
        s2.rollNo = 2220;
        s2.marks = 34;
        
        Student s3 = new Student();
        s3.name = "Maurya";
        s3.rollNo = 2200;
        s3.marks = 36;

        Student student[] = new Student[3];
        student[0] = s1;
        student[1] = s2;
        student[2] = s3;
        for(int i = 0; i < student.length; i++){
            System.out.println(student[i].name+" : "+student[i].rollNo+ " : "+student[i].marks);
        }
    }
    
}
