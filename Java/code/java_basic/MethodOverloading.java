public class MethodOverloading {
    public static void main(String[] args) {
     hiDokja();
     hiDokja("Reader");
     hiDokja("Dokja", "smart");

    }
    static void hiDokja(){
        System.out.println("Hai Dokja");
    }
    static void hiDokja(String name) {
        System.out.println("Hello " + name );
    }
    static void hiDokja(String name, String adj){
        System.out.println("Hallo " + name + " " + adj);
    }
}
