// MainApp.java

public class MainApp {
    public static void main(String[] args) {
        Ninja ninja = new Ninja();
        ninja.setName("Naruto");
        ninja.setRank(NinjaRank.JOUNIN);
        ninja.setElement(Element.FIRE);

        try {
            ValidationUtil.validateNinja(ninja);
            System.out.println("Ninja is valid");
        } catch (ValidationException e) {
            System.out.println("Validation error: " + e.getMessage());
        } catch (NullPointerException e) {
            System.out.println("Unexpected error: " + e.getMessage());
        }

        try {
            ValidationUtil.validateNinja(ninja);
            System.out.println("Ninja is valid");
        } catch (ValidationException | NullPointerException e) {
            System.out.println("Validation error: " + e.getMessage());
        } finally {
            System.out.println("Validation process completed.");
        }

        Ninja ninja2 = new Ninja();
        ninja2.setName("Sakura");
        ninja2.setRank(NinjaRank.GENIN);
        ninja2.setElement(Element.WATER);

        try {
            ValidationUtil.validateRuntime(ninja2);
            System.out.println("Ninja is valid");
        } catch (BlankException | NullPointerException e) {
            System.out.println("Validation runtime error: " + e.getMessage());
        }
    }
}


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

class ValidationUtil {
    public static void validateNinja(Ninja ninja) throws ValidationException {
        if (ninja == null) {
            throw new NullPointerException("Ninja object cannot be null");
        }
        if (ninja.getName() == null || ninja.getName().isEmpty()) {
            throw new ValidationException("Ninja name cannot be empty");
        }
        if (ninja.getRank() == null) {
            throw new ValidationException("Ninja rank cannot be null");
        }
        if (ninja.getElement() == null) {
            throw new ValidationException("Ninja element cannot be null");
        }
    }

    public static void validateRuntime(Ninja ninja) {
        if (ninja == null) {
            throw new NullPointerException("Ninja object cannot be null");
        }
        if (ninja.getName() == null || ninja.getName().isEmpty()) {
            throw new BlankException("Ninja name cannot be empty");
        }
        if (ninja.getRank() == null) {
            throw new BlankException("Ninja rank cannot be null");
        }
        if (ninja.getElement() == null) {
            throw new BlankException("Ninja element cannot be null");
        }
    }
}

class ValidationException extends Exception {
    public ValidationException(String message) {
        super(message);
    }
}

class BlankException extends RuntimeException {
    public BlankException(String message) {
        super(message);
    }
}
