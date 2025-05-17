// Enum Member 
enum NinjaRank {
    GENIN("Beginner ninja"),
    CHUUNIN("Mid-level ninja"),
    JOUNIN("Elite ninja"),
    ANBU("Special Ops");

    private String description;

    NinjaRank(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}

enum Element {
    FIRE("Strong against wind"),
    WATER("Strong against fire"),
    WIND("Strong against lightning"),
    LIGHTNING("Strong against water"),
    EARTH("Strong against lightning");

    private String strengthInfo;

    Element(String strengthInfo) {
        this.strengthInfo = strengthInfo;
    }

    public String getStrengthInfo() {
        return strengthInfo;
    }
}

// Class Ninja
class Ninja {
    private String name;
    private NinjaRank rank;
    private Element element;

    public void setName(String name) {
        this.name = name;
    }

    public void setRank(NinjaRank rank) {
        this.rank = rank;
    }

    public void setElement(Element element) {
        this.element = element;
    }

    public String getName() {
        return name;
    }

    public NinjaRank getRank() {
        return rank;
    }

    public Element getElement() {
        return element;
    }
}


public class NinjaApp {
    public static void main(String[] args) {
        Ninja ninja = new Ninja();

        ninja.setName("Boruto Uzumaki");
        ninja.setRank(NinjaRank.CHUUNIN);
        ninja.setElement(Element.LIGHTNING);

        System.out.println("Name: " + ninja.getName());
        System.out.println("Rank: " + ninja.getRank());
        System.out.println("Rank Description: " + ninja.getRank().getDescription());
        System.out.println("Element: " + ninja.getElement());
        System.out.println("Strength Info: " + ninja.getElement().getStrengthInfo());

        // Konversi enum ke string
        String rankString = ninja.getRank().name();
        System.out.println("Rank Enum Name: " + rankString);

        // Konversi string ke enum
        NinjaRank rank = NinjaRank.valueOf("JOUNIN");
        System.out.println("Rank Enum from String: " + rank);
    }
}
