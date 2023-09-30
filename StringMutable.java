public class StringMutable {
    public static void main(String[] args) {
        //String buffer and String Builder is same but only one difference Buffer is thread safe and Builder is not safe.
        // StringBuffer sb = new StringBuffer("Nitish");
        StringBuilder sb = new StringBuilder("Nitish");
        System.out.println(sb.capacity());

        sb.append("Kumar");
        sb.deleteCharAt(2);
        sb.insert(2,"Kumar");

        System.out.println(sb.length());

        sb.setLength(50);
        sb.ensureCapacity(100);

        System.out.print(sb);
        System.out.println("hello");
    }
    
}
