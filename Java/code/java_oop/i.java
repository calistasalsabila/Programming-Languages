abstract class Animal {
    String name;

    public void run() {
        System.out.println(name + " is running");
    }
    public abstract void  suara();
}

class cat extends Animal {
    public void suara() {
        System.out.println("Meow meow meoooooooowwwwww");
    }
}

public class f {
    public static void main(String[] args) {
        cat Meo = new cat();
        Meo.name = "Meo";
        Meo.suara();
        Meo.run();
    }
}