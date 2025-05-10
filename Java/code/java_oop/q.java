interface hai {
    void hai();

    void hai(String name);
}

public class q {
    public static void main(String[] args) {
        hai dokja = new hai() {
            @Override
            public void hai() {
                System.out.println("Hello, Dokja!");
            }

            @Override
            public void hai(String name) {
                System.out.println("Hello, " + name + "!");
            }
        };

        dokja.hai(); // Output: Hello, Dokja!
        dokja.hai("Dokjaaaa"); // Output: Hello, Dokjaaaa !
    }
}
