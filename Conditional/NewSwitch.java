public class NewSwitch {
    public static void main(String[] args) {

        String day="Monday";
        String result = "";
    //     switch(day) {
    //         case "Sunday", "Saturday":
    //         System.out.println("6am");
    //         break;
    //         case "Monday":
    //         System.out.println("8am");
    //         break;
    //         default:
    //         System.out.println("7am");

    //     }
    // }

    switch(day) {
        case "Sunday", "Saturday" -> result = "6am";
        // System.out.println("6am");
        // break;
        case "Monday" -> result = "8am";
        // System.out.println("8am");
        // break;
        default -> result = "7am";
        // System.out.println("7am");

    }
    System.out.println(result);
}
    
}
