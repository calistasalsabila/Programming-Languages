class ORV {
    String member;
    Integer age;

    ORV(String member) { //wajib di pakai di child , kalo kosong aman sih
        this.member = member;
    }

    ORV(String member, Integer age){
        this.member = member;
        this.age = age;
    }

    void nameMember(String member){
        System.out.println("Hello "+ member + ", Orv member is " + this.member);
    }
}
class orvSecc extends ORV {

    orvSecc(String member){
        super(member);
    }
    orvSecc(String member, Integer age){
        super(member, age); // minimal ada satu yang di panggil
    }
    void nameMember(String member){
        System.out.println("This is overriding");
    }
}
public class Main {
    public static void main(String[] args) {
        var ORVMember1 = new ORV(null);
        ORVMember1.member = "Dokja";
        ORVMember1.nameMember("Dokja turn 0");

        var orvSeccMember1 = new orvSecc("Ok");
        orvSeccMember1.member = "Jeha";
        orvSeccMember1.nameMember("Jeha turn 1864");

    }
}