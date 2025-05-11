package recordClass;

public class App {
    public static void main(String[] args) {
        User user = new User("cal", "secret");

        System.out.println(user);
        System.out.println(user.username());
        System.out.println(user.password());


        System.out.println(new User());
        System.out.println(new User("Cal"));
        System.out.println(new User("Cal", "secret"));
    }
}
