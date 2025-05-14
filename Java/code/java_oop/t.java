// Enum

enum level {
    LOW,
    MEDIUM,
    HIGH
}

class Trusted {
    private String name;
    private level trustLevel;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public void setTrustLevel(level trustLevel) {
        this.trustLevel = trustLevel;
    }

    public level getTrustLevel() {
        return trustLevel;
    }
}

public class t {
    public static void main(String[] args) {
        Trusted trusted = new Trusted();

        trusted.setName("Sai");
        trusted.setTrustLevel(level.HIGH);

        System.out.println("Name: " + trusted.getName());
        System.out.println("Trust Level: " + trusted.getTrustLevel());
    }
}