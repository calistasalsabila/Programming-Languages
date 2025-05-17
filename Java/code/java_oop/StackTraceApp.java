public class StackTraceApp {
    public static void main(String[] args) {

        try {
            exampleError();
        } catch (RuntimeException exception) {
            exception.printStackTrace();
        }

        // try {
        //     String[] names = {
        //             "Hamin", "Jaemin", "Somin"
        //     };

        //     System.out.println(names[1000]);
        // } catch (Throwable throwable) {
        //     StackTraceElement[] stackTraceElements = throwable.getStackTrace();

        //     throwable.printStackTrace();
        // }
    }


    public static void exampleError() {
        try {
            String[] names = {
                    "Hamin", "Jaemin", "Somin"
            };

            System.out.println(names[1000]);
        } catch (Throwable throwable) {
            throw new RuntimeException("An error occurred", throwable);
        }

    }
}


