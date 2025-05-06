// toString() Method
public class m {
    public String name;
    public String title;


    public m(String name, String title) {
        this.name = name;
        this.title = title;
    }

    public String toString() {
        return name + " - " + title;
    }

    public static void main(String[] args) {
        m mc = new m("Dokja", "Reader");
        System.out.println(mc);
    }
}
