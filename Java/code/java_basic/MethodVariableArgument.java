public class MethodVariableArgument {
    public static void main(String[] args) {

        /*  Without argument
        int [] values = {100, 100, 100};
        sayCongrats("Dokja", values); */

        // With argument
        sayCongrats("Biyoo", 90, 85, 97);
        
    }
    /* Without Argument
    static void sayCongrats(String name , int [] values) {
        var total = 0;
        for (var value : values) {
            total += value;
        }
        var finalValue = total / values.length;

        if (finalValue >= 75) {
            System.out.println(" " + name + " " + "Congrats");
        } else {
            System.out.println(" " + name + " " +  "Failed");
        }
    } */
    
    //With Argument
    static void sayCongrats (String name, int ... values) {
        var total = 0;
        for (var value : values){
            total += value;
        }
        var finalValue = total / values.length;
        if (finalValue >= 75) {
            System.out.println(" " + name + " " + "Congrats");
        } else {
            System.out.println(" " + name + " " +  "Failed");
        } 
    }

    
}
