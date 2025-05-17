public class DatabaseError extends Error {
    private String message;

    public DatabaseError(String message) {
        super(message);
    }

  
}