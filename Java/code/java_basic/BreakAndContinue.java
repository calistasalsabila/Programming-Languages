public class BreakAndContinue {
    public static void main(String[] args) {
        
        var counter = 1;

        while(true){
            if (counter == 2) {
                counter++;
                continue;
            }  
            System.out.println("Perulangan ke " + counter);
            counter++;

            if (counter > 10) {
            break;
            }
        }
        
        System.out.println("angka ganjil");

        var angka = 1;
        for (angka = 1 ; angka <= 100 ; angka++){
            
            if(angka % 2 == 0) {
                continue;
            }
            System.out.println("angka ganjil " + angka);
        }
       
    }
}
