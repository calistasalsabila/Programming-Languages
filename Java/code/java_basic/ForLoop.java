public class ForLoop {
    public static void main(String[] args) {

        var counter = 1;
        for (; counter <= 10 ; ) {
            System.out.println("Perulangan ke " + counter);
            counter++;
        } //Output -> Perulangan ke 1-10

        /* Simple = for (var counter = 1 ; counter <= 10 ; counter++ ) {
                        System.out.println("Perulangan ke " + counter); 
                        }*/

        System.out.println(counter); //11

        //Infinite Loop
        /* for (;;) {
            System.out.println("infinite loop");
        }*/

    }
}
