import java.lang.reflect.Field;

public class ValidationUtil {
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

    public static void validationReflection(Object object) {
        Class aClass = object.getClass();
        Field[] fields = aClass.getDeclaredFields();

        for (var field : fields) {
            field.setAccessible(true);

            if (field.getAnnotation(w.class) != null) {
                // validated

                try {
                    String value = (String) field.get(object);
                    if (value == null || value.isEmpty()) {
                        throw new BlankException("Field " + field.getName() + " cannot be empty");
                    }
                } catch (IllegalAccessException exception) {
                    System.out.println("Cant access field " + field.getName());

                }

            }

        }
    }
}
