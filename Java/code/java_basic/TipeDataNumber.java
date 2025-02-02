public class TipeDataNumber {
    public static void main(String[] args) {
        
        byte iniByte = 100;
        short iniShort = 1000;
        int iniInt = 100000;
        long iniLong = 10000000;
        long iniLong2 = 10000000L;

        float iniFloat = 0.12F; //F untuk menandakan ini Float
        double iniDouble = 0.12;

        //kode literals
        int decimalInt = 99;   
        int hexInt = 0xA9; // tambah 0x di awal
        int binInt = 0b0101; // tambah 0b di awal

        //kode underscore
        int amount = 1_000_000;

        /*konversi tipe data number 
        Widening Casting (Otomatis) : byte -> short -> int -> long -> float -> double
        Narrowing Casting (Manual) : double -> float -> long -> int -> short -> byte 

        byte iniByte = 10;
        short iniShort = iniByte;
        int iniInt = iniShort;

        int iniInt2 = 10;
        byte iniByte2 = (byte) iniInt; */


    }
}
