class Dokja {
    int power = 10;

    void showPower() {
        System.out.println("Dokja's power: " + power);
    }
}

class Jeha extends Dokja {
    int power = 20; // hidden variable

    @Override
    void showPower() {
        System.out.println("Jeha's power: " + power);
    }

    void specialSkill() {
        System.out.println("Jeha uses special skill!");
    }
}

public class f {
    public static void main(String[] args) {
        // Upcasting
        Dokja dokjaRef = new Jeha(); // upcasting
        System.out.println("== Upcasting ==");
        dokjaRef.showPower(); // Jeha's power: 20 (overridden method)
        System.out.println("Power: " + dokjaRef.power); // Power: 10 (hidden variable)

        // Downcasting
        if (dokjaRef instanceof Jeha) {
            Jeha jehaRef = (Jeha) dokjaRef;
            System.out.println("== Downcasting ==");
            jehaRef.showPower(); // Jeha's power: 20
            System.out.println("Power: " + jehaRef.power); // Power: 20
            jehaRef.specialSkill(); // Jeha uses special skill!
        }

        // Downcasting gagal
        Dokja dokjaAsli = new Dokja();
        if (dokjaAsli instanceof Jeha) {
            Jeha salahRef = (Jeha) dokjaAsli; // runtime error jika dipaksa
        } else {
            System.out.println("== Downcasting Gagal ==");
            System.out.println("dokjaAsli bukan instance dari Jeha");
        }
    }
}
