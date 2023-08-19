import java.util.Scanner;
public class StarSecond {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int num = s.nextInt();

        for(int i = 0; i < num; i++){
            for(int j = i; j < num; j++){
                System.out.print("* ");
            }
            System.out.println();
            s.close();
        }
    }
}
