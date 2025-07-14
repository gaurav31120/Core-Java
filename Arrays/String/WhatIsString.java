package Arrays.String;

public class WhatIsString {
    public static void main(String[] args) {
        
        String name = new String("Gaurav");
        // String name = "Gaurav"; // most common way to use
        System.out.println(name);
        System.out.println(name.hashCode()); //hashcode
        System.out.println("hello " + name); // concatenate
        System.out.println("hello " + name); 
        System.out.println(name.charAt(1)); // find by index
        System.out.println(name.concat(" Kumar")); // concatenate
    }
    
}

