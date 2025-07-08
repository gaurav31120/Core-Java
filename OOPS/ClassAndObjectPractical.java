package OOPS;

class Calculator {     // class

    int a;           // variable

    public int add(int n1, int n2)    // method
    {
        System.out.println("in add");
        int r = n1 + n2;
        
        return r;
    }
}


public class ClassAndObjectPractical {

    public static void main(String[] args) {
        
        int num1 = 4;
        int num2 = 5;
        
        // Object creation ---- New object of type calculator
        Calculator calc = new Calculator(); // calc is reference variable
                                            // Calculator is classname which is declared abovw
        int result = calc.add(num1 ,num2);

        // int result =  num1 + num2;

        System.out.println(result);
    }
    
}



