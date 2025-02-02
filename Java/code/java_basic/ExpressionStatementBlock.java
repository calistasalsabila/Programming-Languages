public class ExpressionStatementBlock {
    public static void main(String[] args) {
     
    // assignment statement
    int value = 100; //value -> expression

    //i ncreament statement
    value++;

    // method invocation statement
    System.out.println(value); 

    /* object creation statement

    ClassName objectName = new ClassName ();

    ClassName   -> Nama kelas yang menjadi dasar pembuatan object
    objectName  -> Nama variabel yag akan mereferensikan object yang di buat
    new         -> Kata kunci untuk menciptakan object di memori
    ClassName   -> Panggilan constructor, yaitu metode khusus untuk menginisialisasi object

    example : 
-> Kelas Car
    class Car {
        String brand;
        int speed;

-> Constructor untuk menginisialisasi properti
    public Car(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

-> Method untuk menampilkan informasi mobil
    public void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Speed: " + speed + " km/h");
    }
}

-> Program Utama
public class Main {
    public static void main(String[] args) {
         
-> Membuat object myCar
        Car myCar = new Car("Toyota", 120);

->  Memanggil method displayInfo
        myCar.displayInfo();

-> Membuat object tambahan untuk contoh lain
        Car yourCar = new Car("Honda", 100);
        yourCar.displayInfo();

    }
}

    Output :
    Brand: Toyota
    Speed: 120 km/h
    Brand: Honda
    Speed: 100 km/h
    */

  
    }
    
}
