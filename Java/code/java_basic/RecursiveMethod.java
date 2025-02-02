public class RecursiveMethod {
    public static void main(String[] args) {

        System.out.println((faktorialLoop(7)));

        System.out.println((faktorialRecursive(7)));

        loop(100);
    }
    // Without recursive
    static int faktorialLoop (int value) {
        var result = 1;

        for (var counter = 1 ; counter <= value ; counter++ ) {
            result *= counter;
        }
        return result;
    }
    // With recursive
    static int faktorialRecursive(int value) {
        if (value == 1) {
            return 1;
        }else
            return value*faktorialRecursive(value-1);
    }
    static void loop (int value){
        if (value == 0 ) {
            System.out.println("clear");
        } else {
            System.out.println("Loop ke " + value);
            loop(value-1); }
    }
    
}
