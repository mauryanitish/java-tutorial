public class ArrayFirst {
    public static void main(String args[])
    {
        int[]  num= {4,6,3,2,4};
        //index num  0,1,2,3,4
        num[2]=10;//Change the value of array at perticular point
        for(int i = 0; i < 5; i++){
            System.out.println(num[i]);
        }
    }
}
