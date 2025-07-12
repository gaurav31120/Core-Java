package OOPS;

class Calculator
{
    int numl; // instance var

    public int add(int n1, int n2) {
        return n1 + n2; // n1 n2 local var

    }
}

public class StackAndHeapInJava {
    public static void main(String[] args) {
        int data = 10; // declared in dtsck
        Calculator obj = new Calculator();  // onjects are stored in heaps
        int r1 = obj.add(3,4);
        System.out.println(r1);
        
    }
    
}
