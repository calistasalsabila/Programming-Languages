public class ValidationApp {
    public static void main(String[] args) {
        // Ninja 1: Naruto
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
            System.out.println("An unexpected error occurred: " + e.getMessage());
        }

        // Ninja 1: Multiple catch
        try {
            ValidationUtil.validateNinja(ninja);
            System.out.println("Ninja is valid");
        } catch (ValidationException | NullPointerException e) {
            System.out.println("Validation error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Unexpected error: " + e.getMessage());
        } finally {
            System.out.println("Validation process completed.");
        }

        // Ninja 2: Sakura
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
