import java.util.Scanner;
public class StarFirst {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of row :");
        int num = s.nextInt();
        for(int i = 0; i < num; i++){
            for(int j = 0; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
            s.close();
        }
    }
}
