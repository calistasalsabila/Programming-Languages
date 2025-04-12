import calista.data.*; //  Wildcard import

public class App {
    public static void main(String[] args) {
        //  var B = new A()  ; Error, abstract class
       var B = new B();
       B.name = "Bzzzttt";

       System.err.println(B.name);
    }
}
