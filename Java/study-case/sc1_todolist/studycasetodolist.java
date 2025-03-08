import java.util.Scanner;

public class studycasetodolist {
    private static String[] model = new String[10];
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        viewShowTodoList();
    }

    // Menampilkan To-Do List
    public static void showTodoList() {
        System.out.println("TO-DO LIST");
        for (int i = 0; i < model.length; i++) {
            if (model[i] != null) {
                System.out.println((i + 1) + ". " + model[i]);
            }
        }
    }

    // Menambahkan To-Do ke dalam list
    public static void addTodoList(String todo) {
        boolean isFull = true;
        for (String item : model) {
            if (item == null) {
                isFull = false;
                break;
            }
        }

        if (isFull) {
            String[] temp = model;
            model = new String[model.length * 2];
            System.arraycopy(temp, 0, model, 0, temp.length);
        }

        for (int i = 0; i < model.length; i++) {
            if (model[i] == null) {
                model[i] = todo;
                break;
            }
        }
    }

    // Menghapus To-Do List berdasarkan nomor
    public static boolean removeTodoList(int number) {
        if ((number - 1) >= model.length || model[number - 1] == null) {
            return false;
        }

        for (int i = number - 1; i < model.length - 1; i++) {
            model[i] = model[i + 1];
        }
        model[model.length - 1] = null;
        return true;
    }

    // Menghapus semua To-Do List
    public static void removeAllTodoList() {
        for (int i = 0; i < model.length; i++) {
            model[i] = null;
        }
        System.out.println("All To-Do List has been removed successfully.");
    }

    // Input dari pengguna
    public static String input(String info) {
        System.out.print(info + ": ");
        return scanner.nextLine();
    }

    // Menampilkan menu utama
    public static void viewShowTodoList() {
        while (true) {
            showTodoList();
            System.out.println("Menu:");
            System.out.println("1. Add");
            System.out.println("2. Remove");
            System.out.println("3. Exit");
            System.out.println("4. Remove All");

            String choice = input("Choose");
            switch (choice) {
                case "1":
                    viewAddTodoList();
                    break;
                case "2":
                    viewRemoveTodoList();
                    break;
                case "3":
                    return;
                case "4":
                    viewRemoveAllTodoList();
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }

    // Menampilkan view untuk menambah To-Do List
    public static void viewAddTodoList() {
        System.out.println("ADD TO-DO LIST");
        String todo = input("Enter To-Do (type 3 to cancel)");
        if (!todo.equals("3")) {
            addTodoList(todo);
        }
    }

    // Menampilkan view untuk menghapus To-Do List
    public static void viewRemoveTodoList() {
        System.out.println("REMOVE TO-DO LIST");
        String number = input("Enter Number (type 3 to cancel)");
        if (!number.equals("3")) {
            boolean success = removeTodoList(Integer.parseInt(number));
            if (!success) {
                System.out.println("Failed to remove item: " + number);
            }
        }
    }

    // Menampilkan view untuk menghapus semua To-Do List
    public static void viewRemoveAllTodoList() {
        String confirmation = input("Are you sure to remove all To-Do List? (type 3 to cancel)");
        if (!confirmation.equals("3")) {
            removeAllTodoList();
        }
    }
}
