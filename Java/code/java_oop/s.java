class Name {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public void sayName() {
        System.out.println("Name is: " + name);
    }

    // Static inner class
    public static class S {
        private String name;

        public void hi() {
            System.out.println("Hai from static class S");
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    // Non-static inner class
    public class H {
        private String note;

        public void hello() {
            // Bisa akses field 'name' dari outer class
            System.out.println("Hello from inner class H, outer's name is: " + name);
        }

        public void setNote(String note) {
            this.note = note;
        }

        public String getNote() {
            return note;
        }
    }
}

// Static block
class StaticBlock {
    public static final int hm;
    static {
        System.out.println("acess StaticBlock classssss");
        hm = Runtime.getRuntime().availableProcessors();
    }
}

public class s {
    public static void main(String[] args) {
        // Buat object dari outer class
        Name orv = new Name();
        orv.setName("Oldest Dream");

        // Akses static inner class , bisa langsung buat objek tanpa harus buat dulu dari outernya
        Name.S staticObj = new Name.S();
        staticObj.setName("Dazai Osamu");
        staticObj.hi();
        System.out.println("Static inner class name: " + staticObj.getName());

        // Akses non-static inner class
        Name.H nonStaticObj = orv.new H(); // harus buat dulu objek dari outer class -> orv
        nonStaticObj.setNote("Hi, Dokja!");
        nonStaticObj.hello();
        System.out.println("Note from H: " + nonStaticObj.getNote());


        // Static block
        System.out.println("Available Processors: " + StaticBlock.hm);
    }
}
