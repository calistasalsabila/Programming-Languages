// equals method
public class n {
    public static void main(String[] args) {
        String first = "Cyan";

        first = first + " " + "Vert";

        System.out.println(first);

        String second = "Cyan Vert";
        System.out.println(second);

        String third = "Cyan Vert";


        System.out.println(first.equals(second)); // true 
        System.out.println(first == second); // false
        System.out.println(first == first); // true
        System.out.println(second == second); // true
        System.out.println(second == third); // true , Karena "Cyan Vert" adalah string literal yang sama, Java menyimpannya satu kali di string pool, jadi second == third menunjuk ke objek yang sama.


    }
}
