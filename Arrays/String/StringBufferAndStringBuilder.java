package Arrays.String;

public class StringBufferAndStringBuilder {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Gaurav");
        System.out.println(sb.capacity());

        System.out.println(sb.length()); // tells length
        sb.append(" Kumar");
        System.out.println(sb);

        String str = sb.toString();  // to convert to string format

        sb.deleteCharAt(2); // Garav Kumar --> removed u from Gaurav
        System.out.println(sb);  

        sb.insert(0,"Java "); // Java Garav Kumar
        System.out.println(sb);

        sb.setLength(30);   // adds extra data till 30
        System.out.println(sb);
    }
    
}
