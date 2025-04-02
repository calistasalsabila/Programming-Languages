class orv {
    String name;

    orv(String name) {
        this.name = name;
    }

    void memberOrv() {
        System.out.println("My name is " + this.name);
    }
}

class dj extends orv {
    String place;

    dj(String name) {
        super(name); // Ambil dari superclass
    }

    dj(String name, String place) {
        super(name);
        this.place = place;
    }

    void memberOrv() {
        System.out.println("Hi, my name is " + this.name + " and I'm in " + this.place);
    }
}

class jh extends orv {
    String weapon;

    jh(String name) {
        super(name);
    }

    jh(String name, String weapon) {
        super(name);
        this.weapon = weapon;
    }

    void memberOrv() {
        System.out.println("Hi, my name is " + this.name + " and my weapon is " + this.weapon);
    }
}

public class novel {
    public static void main(String[] args) {
        dj dokja = new dj("Dokja", "Seoul");
        jh jeha = new jh("Jeha", "Sword");
        //Polymorphism
        orv gily = new dj("Gilyoung", "Earth");
        orv hades = new jh("Hades", "Black bident");
        

        dokja.memberOrv(); // Output: Hi, my name is Dokja and I'm in Seoul
        jeha.memberOrv(); // Output: Hi, my name is Jeha and my weapon is Sword
        gily.memberOrv(); // Output : Hi, my name is Gilyoung and I'm in Earth
        hades.memberOrv(); // Output : Hi, my name is Hades and my weapon is Black bident
        
        System.out.println(dokja.name); //Dokja
        System.out.println(gily.name);  //Gilyoung
    }
}
