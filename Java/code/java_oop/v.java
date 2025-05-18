import java.lang.annotation.*;

@Target({ ElementType.TYPE, ElementType.METHOD })
@Retention(RetentionPolicy.RUNTIME)

public @interface v {
    String name();
    
    String [] tag() default {};

}

// public class TestAnnotation {
//     @v(name = "Test Method", tag = { "tag1", "tag2" })
//     public void testMethod() {
//         System.out.println("This is a test method.");
//     }
    
//     public static void main(String[] args) {
//         TestAnnotation test = new TestAnnotation();
//         test.testMethod();
        
//         // Accessing the annotation
//         v annotation = test.getClass().getMethod("testMethod").getAnnotation(v.class);
//         System.out.println("Name: " + annotation.name());
//         System.out.println("Tags: " + String.join(", ", annotation.tag()));
//     }
// }