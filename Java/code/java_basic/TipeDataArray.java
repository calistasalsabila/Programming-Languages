import java.util.Arrays;

public class TipeDataArray {
    public static void main(String[] args) {
        
        String [] stringArray;
        stringArray = new String [2]; //String [] stringArray = new String[2];

        stringArray [0] = "Kim";
        stringArray [1] = " Dokja";

        System.out.print(stringArray[0]);
        System.out.println(stringArray[1]);

        //Output Kim Dokja

        stringArray [0] = "Mas";
        System.out.print(stringArray[0]);
        System.out.println(stringArray[1]);

        //Output Mas Dokja

        String [] stringArray2 = {"Kim", "Dokja"};

        //how to write array

        int [] intArray = new int [] {1,2,3};

        long [] arrayLong = {10L, 20L, 30L};

        //Print semua arrayLong

        System.out.println(Arrays.toString(arrayLong));

        //Print panjang array

        System.out.println(arrayLong.length);
        //Output 3

        //Tak ada cara untuk menghapus elemen aray, paling di buat = 0  atau = null :)
        /*Operasi di Array
        array [index]               Mengambil data di array
        array [index] = value       Mengubah data di array
        array.length                Mengambil panjang array*/

        //Array dalam array

        String[][] partyDokja = {
            {"Fourth", " Wall"},
            {"Lee","Gilyoung"},
            {"Yoo", "Sangah"},
            {"Han", "Sooyoung"},
            {"Yoo", "Junghyuk"}
        };

        System.out.print(partyDokja[0][0]);
        System.out.println(partyDokja[0][1]);

    }
    
}
