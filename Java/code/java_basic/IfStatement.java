public class IfStatement {
    public static void main(String[] args) {
        
    var nilai = 90;
    var absen = 3;

    if(nilai >= 85 && absen <= 5) {
        System.out.println("Kamu lulus");
    }
    else if (nilai >= 85 || absen >= 5) {
        System.out.println("hayo absennya kurang wkwk");
    }
    else {
        System.out.println("Semangat");
    }
    /* Penjabaran code if 
    public class ifst {
    public static void main(String[] args) {

    var nilai = 90;
    var absen =3;
      
    var lulusnilai = nilai >= 85;
    var lulusabsen   = absen <= 5;
     
    var lulus =  lulusnilai && lulusabsen;
     
    if (lulus) {
       System.out.println("Kamu lulus");
       }
     }
    }
     */

    }
}
