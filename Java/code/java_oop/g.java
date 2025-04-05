class Dokja {
    void speak() {
        System.out.println("I'm Dokja.");
    }
}

class Jeha extends Dokja {
    void code() {
        System.out.println("I'm coding in Java!");
    }
}

public class g {
    public static void main(String[] args) {
        Jeha jeha = new Jeha();            
        Dokja dokjaRef = jeha;  // upcasting      
        dokjaRef.speak();                  

        // dokjaRef.code(); error

        Jeha jehaRef = (Jeha) dokjaRef;    
        jehaRef.code();                    
    }
} 
