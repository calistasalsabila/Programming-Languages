public class ValidationApp {
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
        } // terjadi lebih dari satu exception
        catch (NullPointerException e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        }

        // Multiple try catch
        try{
            ValidationUtil.validateNinja(ninja);
            System.out.println("Ninja is valid");
        } catch (ValidationException | NullPointerException e) {
            System.out.println("Validation error: " + e.getMessage());
        } catch (Exception e) { // turunan dari thwrowable
            System.out.println("An unexpected error occurred: " + e.getMessage());
        } finally {
            System.out.println("Validation process completed.");
        }
    }
}
