public class BooleanOperators {
    public static void main(String[] args) {
        
    var kehadiran = 14;
    var ipk = 3.91;

    boolean minimalKehadiran = kehadiran >= 16;
    boolean minimalIpk = ipk >= 3.50;

    var lulus = minimalKehadiran && minimalIpk;

    System.out.println(lulus);

    //Output false


    }
    
}
