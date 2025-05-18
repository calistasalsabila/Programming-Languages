import java.io.*;

public class ReadApp {
    public static void main(String[] args) {
        BufferedReader bufferedReader = null;

        try {
            bufferedReader = new BufferedReader(new FileReader("README.md"));

            String text;
            while ((text = bufferedReader.readLine()) != null) {
                System.out.println(text);
            }

        } catch (Throwable throwable) {
            System.out.println("An error occurred: " + throwable.getMessage());

        } finally {
            if (bufferedReader != null) {
                try {
                    bufferedReader.close();
                } catch (IOException e) {
                    System.out.println("Error closing the reader: " + e.getMessage());
                }
            }
        }
    }
}

// atau gini juga bisa

// import java.io.BufferedReader;
// import java.io.FileReader;
// import java.io.IOException;

// public class ReadApp {
//     public static void main(String[] args) {
//         try (BufferedReader reader = new BufferedReader(new FileReader("README.md"))) {
//             String line;
//             while ((line = reader.readLine()) != null) {
//                 System.out.println(line);
//             }
//         } catch (IOException e) {
//             System.out.println("Terjadi kesalahan saat membaca file: " + e.getMessage());
//         }
//     }
// }
