public class SwitchStatement {
    public static void main(String[] args) {
        // Switch Statement
        var nilai = "A";

        switch (nilai) {
            case "A":
                System.out.println("keren");
                break;
            case "B": //gabung dengan C
            case "c":
                System.out.println("ok");
                break;
            case "D":
                System.out.println("?");
                break;
            case "E":
                System.out.println("blm d input mungkin");
                break;
            default:
                System.out.println("waduh, pindah jurusan aja");
                break;
        }
        // Switch Expression
        // Switch Lambda -> beberapa tipe data tidak di dukung (ex = float, double, dst) sama seperti switch statement
        var ip = "4.00";
        System.out.print("kategori ip ");
        switch (ip) {
            case "4.00" -> {System.out.println("A");}
            case "3.70" -> {System.out.println("A-");}
            case "3.50" -> {System.out.println("B+");}
            case "3.00" -> {System.out.println("B");}
            case "2.70", "2.00", "1.00" -> {System.out.println("hm");}
            default   -> {System.out.println("hmm");}
        }

        var ipk = "4.00";
        String ucapan; 
        switch (ipk) {
            case "4.00" -> ucapan = "Amazing";
            case "3.70" -> ucapan = "Gud Job";
            case "3.50" -> ucapan = "Nais";
            case "3.00" -> ucapan = "Gud work";
            case "2.70", "2.00", "1.00" -> ucapan = "Ok";
            default   -> ucapan = "tidak bisa berkata kata";
        }
        System.out.println(ucapan);

        // yield        
        ucapan = switch (ipk) {
            case "4.00" : 
                yield "Perfect";
            case "3.70" : 
                yield "Keren";
            case "3.50" : 
                yield "Hebat";
            case "3.00" : 
                yield "Oks";
            case "2.70", "2.00", "1.00" : 
                yield "Bruh";
            default     : 
                yield "Ngapain aja coy";
        };
        System.out.println(ucapan);

    }
}
