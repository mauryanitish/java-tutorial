public class WrapperClasses {
    public static void main(String[] args) {
        //Wrapping class
        Integer num1 = new Integer(34);//boxing
        Integer num2 = 32; //auto-boxing
        System.out.println(num1);
        System.out.println(num2);

        int  num3 = num1;//auto-unboxing
        int num4 = num1.intValue();//unboxing
        System.out.println(num3+" "+num4); 

        //Typeconversion
        String str = "30";
        //convert to primitive integer
        int num5 = Integer.parseInt(str);
        System.out.println(num5);
        //convert to object integer
        int num6 = Integer.valueOf(str);
        System.out.println(num6);
    }
}