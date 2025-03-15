package code.java_oop;

class mc {
    String name;
    String title;
    final String country = "South Korea";

    // Constructor
    mc(String name, String title) {
        this.name = name;
        this.title = title;
    }

    // Override toString() agar bisa cetak isi objek dengan benar
    @Override
    public String toString() {
        return "MC Name: " + name + ", Title: " + title + ", Country: " + country;
    }

    public static void main(String[] args) {
        mc mc1 = new mc("Dojja", "Dk");

        // Tanpa toString() -> Akan mencetak alamat memori
        System.out.println(mc1);  

        // Dengan toString() -> Mencetak isi objek dengan format yang jelas
        System.out.println(mc1.toString()); 
    }
}
