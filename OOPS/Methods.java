package OOPS;

class Computer                 // class
{
    public void playMusic()                // behaviour of class: Computer
    // access -- public --> can be accisible from anywhere
    // void ---- doesnot return anything
    {

    }

    public String getMeAPen(int cost) 
    {
        if(cost >= 10) {
            return "Pen";
        }
            return "Nothing";
    }
}

public class Methods {

    public static void main(String[] args) {
        Computer obj = new Computer(); 
        obj.playMusic();
        String str = obj.getMeAPen(10); // to access class we need to declare an object
                 // class is just an idea (blueprint) --> to use it we need object
                 // obj --> reference variable
                 System.out.println(str);
    }

    
}
