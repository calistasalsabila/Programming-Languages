public class ValidationException extends Throwable {

    private String message;

    public ValidationException(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    // atau bisa gini ; getMessage() { return message; } itu udah ada di parent class sebenarnya

    // public ValidationException(String messagge) {
    // calling parent constructor from Throwable
    //     super(message);
    // }

    
}