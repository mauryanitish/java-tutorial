/**Take input of age of 3 people by user and determine oldest and youngest among them.
 */
import java.util.Scanner;
public class Age {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the age of 3 people :");
        int age1 = s.nextInt();
        int age2 = s.nextInt();
        int age3 = s.nextInt();
        int older;
        int youngest;

        if(age1>age2&&age1>age3){
            older = age1;
            if(age2<age3)
                youngest = age2;
            else
                youngest = age3;
        }
        else
        if(age2>age3){
            older = age2;
            if(age1<age3)
                youngest = age1;
            else
                youngest = age3;
        }
        else{
            older = age3;
            if(age1<age2)
                youngest = age1;
            else
                youngest = age2;
        }
        System.out.println("Oldest person age :"+older);
        System.out.println("Youngest person age :"+youngest);
        s.close();
    }
}
