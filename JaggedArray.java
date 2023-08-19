public class JaggedArray {
    public static void main(String aargs[]){
        int num[][][] = new int[3][][];
        num[0] = new int[2][3];
        num[1] = new int[4][3];
        num[2] = new int[2][4];

        for(int i = 0; i < num.length; i++){
            for(int j = 0; j < num[i].length; j++){
                for(int k = 0; k < num[i][j].length; k++){
                    num[i][j][k] = (int)(Math.random() * 10);
                }
            }
        }

        for( int n[][] : num){
            for(int m[] : n){
                for(int o : m){ 
                    System.out.println(o+" ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
    
}
