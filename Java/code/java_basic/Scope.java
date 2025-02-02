public class Scope {
    public static void main(String[] args) {

        webtoon("Hamin Lee");   
    }
    static void webtoon (String name) {
        String mc = "Hello " + name;

        if (!name.isBlank()){
            String maincharacter = "The mc is " + name;
            System.out.println(maincharacter);
        }

    }
}
