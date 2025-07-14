package Arrays.String;

public class MutableVsImmutableString {
    public static void main(String[] args) {
        String name = "gaurav";
        name = name + " kumar";
        System.out.println("hello " + name); // hello Gaurav Kumar

        String s1 = "Gaurav";  // both s1 and s2 have one object and only 
        String s2 = "Gaurav";  // two different references

        System.out.println(s1 == s2); // true

        // In Java there will be only one object created for same value
        
    }
    
}
