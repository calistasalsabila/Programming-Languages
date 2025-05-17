public class DatabaseApp {
    public static void main(String[] args) {
        connectToDatabase("Killua", "Zoldyck");
        System.out.println("Success");

    }
    public static void connectToDatabase(String username, String password) {
        if (username == null || password == null) {
            throw new DatabaseError("Username or password cannot be null");
        }
    }
}
