public class MethodParameter {
    public static void main(String[] args) {
        Hello("Kim", "Dokja");
        Hello("Yoo", "Junghyuk");
        Hello("Han", "Sooyoung");
        
    }
    static void Hello(String firstName, String lastName){
        System.out.println("Hello " + firstName + " " + lastName);
    }
}
