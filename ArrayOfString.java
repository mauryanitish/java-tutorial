class ArrayOfString{
    public static void main(String[] args) {
        String []arg = new String[4];
        for(int i = 0; i < arg.length; i++){
            // arg[i] = "arg"+"$i";
        }
        for(String n : arg){
            System.out.println(n);
        }
    }
}