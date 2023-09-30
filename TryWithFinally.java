import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TryWithFinally {
    public static void main(String[] args) throws NumberFormatException, IOException {
        int num = 0;
        try{
            InputStreamReader in = new InputStreamReader(System.in);
            BufferedReader bf = new BufferedReader(in);
            num = Integer.parseInt(bf.readLine());
            System.out.println(num);
        }
        finally{
            System.out.println("done finally....");
        }
    }
}
