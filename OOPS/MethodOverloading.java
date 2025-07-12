package OOPS;

class Calculator1 {
    // Here, we are using 2 diferent method (aad and add1) for different arguments-- 
    // method overloading will solve this issue
    public int add(int n1, int n2, int n3) 
    {
        return n1 + n2 + n3;
    }
    // public int add1(int n1, int n2) {
    //     return n1 + n2;
    // }

    public int add(int n1, int n2) 
    {
        return n1 + n2;
    }
    public double add(double n1, int n2) 
    {
        return n1 + n2;
    }
        

}

public class MethodOverloading {

    public static void main(String[] args) {
        Calculator1 obj = new Calculator1();
        int r1 = obj.add(3,4,5);
        // int r2 = obj.add1(3,4);
        int r3 = obj.add(3,4);
        double r4 = obj.add(3.66,4);
        System.out.println(r1);
        // System.out.println(r2);
        System.out.println(r3);
        System.out.println(r4);
    }
    
}
