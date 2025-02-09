public class studycasetodolist {
    
    public static String[] model = new String [10];

    public static java.util.Scanner scanner = new java.util.Scanner(System.in);
    public static void main(String[] args) {
        viewShowTodolist();
        
    }
    // Menampilkan todolist
    public static void showTodolist(){
        System.out.println("TO DO LIST");
        for (var i = 0 ; i < model.length ; i++ ) {
        var todo = model [i];
        var no = i + 1;

        if (todo != null){
            System.out.println(no + ". " + todo);
            }
        }
    }
    // tes show to do list
    public static void testshowTodolist(){
        model[0] = "Belajar";
        model [1] = "Rebahan";
        showTodolist();
    }

    // Menambah todo ke list  
    public static void addTodolist(String todo){
        // cek apakah model isFull?
        var isFull = true;
        for (var i = 0 ; i < model.length ; i++){
            if(model[i] == null){
                isFull = false;
                break;
            }
        }
        // resize
        if(isFull){
            var temp = model;
            model = new String [model.length * 2];
            for(var i = 0 ; i < temp.length ; i++){
                model[i] = temp[i];
            }
        }

        // tambahkan ke posisi yang data array nya null
        for (var i = 0 ; i < model.length ; i++){
            if (model[i] == null) {
                model[i] = todo;
                break;
            } 

        }

    }

    public static void testAddTodolist(){
        for(var i = 0 ; i < 25 ; i++){
            addTodolist("contoh to do ke " + i);
        }

        showTodolist();
    }
    // Menghapus todo yang ada di dalam list
    public static boolean removeTodolist(Integer number){
        if((number - 1) >= model.length){
            return false;
        }
        else if(model[number -1] == null){
            return false;
        } else {
            for (int i = number - 1; i < model.length ; i++){
                if(i == (model.length - 1)) {
                    model[i] = null;
                }else {
                model[i] = model [i + 1];
                }
            }
            return true;
        } 
    }
    // test remove todolist
    public static void testRemoveTodolist(){
        addTodolist("bobok");
        addTodolist("rebahan");
        addTodolist("makan");
        addTodolist("sleep");
        addTodolist("ikan");

        var result = removeTodolist(7);
        System.out.println(result);

        result = removeTodolist(2);
        System.out.println(result);
        showTodolist();
    }
    public static String input(String info){
        System.out.print(info + " : ");
        String data = scanner.nextLine();
        return data;
    }
    public static void testInput(){
        var name = input ("Nama");
        System.out.println("hi " + name);

        var channel = input("channel");
        System.out.println(channel);
    }

    // Menghapus semua todolist
    public static void removeAllTodolist(){
        for(int i = 0 ; i < model.length ; i++){
            model [i] = null;
        }
        System.out.println("Remove All Todolist Has Been Succesed");
    }
    
    // Menampilkan view todolist
    public static void viewShowTodolist(){
        while(true){
        showTodolist();

        System.out.println("Menu");
        System.out.println("1. Add");
        System.out.println("2. Remove");
        System.out.println("3. Exit");
        System.out.println("4. Remove all");

        var input = input("Choose ");

        if(input.equals("1")){
           viewAddTodolist();
        }else if (input.equals("2")){
            viewRemoveTodolist();
        }else if(input.equals("3")){
            break;
        }else if(input.equals("4")){
            ViewRemoveAllTodolist();
        }
        else{
            System.out.println("Invalid");
        }
    }

    }

    public static void testViewShowTodolist(){
        addTodolist("satu");
        addTodolist("dua");
        addTodolist("tiga");
        addTodolist("empat");
        addTodolist("lima");
        viewShowTodolist();
    }
    // Menampilkan view add todolist
    public static void viewAddTodolist(){
        System.out.println("ADD TO DO LIST");

        var todo = input("todo (choose 3 if u want to exit ))");

        if(todo.equals("3")){
            // batal
        }else {
            addTodolist(todo);
        }
    }

    public static void testViewAddTodolist() {
        addTodolist("satu");
        addTodolist("dua");
        addTodolist("tiga");
        viewAddTodolist();

        showTodolist();
    }
    // Menampilkan view remove todolist
    public static void viewRemoveTodolist(){
        System.out.println("REMOVE TODOLIST");
        var number = input("Number (choose 3 if u want to exit)");

        if(number.equals("3")){
            //batal
        }else {
           boolean success = removeTodolist(Integer.valueOf(number));
           if(!success){
            System.out.println("Failed to remove list : " + number);
           }
        }
    }
    public static void testViewRemoveTodolist(){
        addTodolist("satu");
        addTodolist("dua");
        addTodolist("tiga");

        showTodolist();

        viewRemoveTodolist();

        showTodolist();
    }
    public static void ViewRemoveAllTodolist(){
        var agreement = input("Are you agree to remove all to do list(choose 3 if u want to exit)");
        if(agreement.equals("3")){
            //batal
        }else {
            removeAllTodolist();
        }

    }


}
