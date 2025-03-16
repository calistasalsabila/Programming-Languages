
// Class Mc
class Mc {
    String name;
    String title;
    final String country = "South Korea";

    // Constructor dengan dua parameter
    Mc(String paramName, String paramTitle) {
        name = paramName;
        title = paramTitle;
    }

    // Constructor dengan satu parameter
    Mc(String paramName) {
        this("Dokja", "Jeha");
    }

    // Constructor tanpa parameter
    Mc() {
        this("Dokja");
    }

    void sayHello(String paramName) {
        System.out.println("Hello " + paramName + ", my name is " + name);
    }
}

// Class utama (entry point) dengan method main()
public class McApp {
    public static void main(String[] args) {
        // Membuat objek Mc
        var mc1 = new Mc("Dokja1", "Reader");

        // Menampilkan atribut
        System.out.println(mc1.name);
        System.out.println(mc1.title);
        System.out.println(mc1.country);

        // Memanggil method sayHello()
        mc1.sayHello("Dokja");

        // Membuat objek lain
        Mc mc2 = new Mc("Dokja");

        // Deklarasi dan inisialisasi objek
        Mc mc3;
        mc3 = new Mc();
        mc3.name = "Jeha";
        mc3.sayHello("Dokja");
    }
}
