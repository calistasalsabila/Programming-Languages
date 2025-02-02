public class Variable {
    public static void main(String[] args) {
        
        String name;
        name = "King of Kingless World";

        int age = 28;
        String adress = "Demon Realm 73rd";

        System.out.println(name);
        System.out.println(age);
        System.out.println(adress);

        name = "Kim Dokja";
        System.out.println(name);
        
        /*Output
         * King of Kingless World
         * 28
         * Demon Realm 73rd
         * Kim Dokja*/

         //Kata kunci Var ---> harus langsung diinisialisasi nilainya

         var name1 = "Sung Suho"; //var membuat variabel baru
         var age1 = 21;
         var strength = "unknown";

         System.out.println(name1);
         System.out.println(age1);
         System.out.println(strength);

         /*Output
          * Sung Suho
          * 21
          * unknown*/

        final String animal = "paus"; //nama variabel tidak dapat di ubah
        System.out.println(animal);
        //Output paus

    }
    
}
