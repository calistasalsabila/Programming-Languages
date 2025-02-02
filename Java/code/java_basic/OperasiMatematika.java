public class OperasiMatematika {
    public static void main(String[] args) {
        
    int a = 1;
    int b = 2;

    System.out.println(a+b); //3
    System.out.println(a-b); //-1
    System.out.println(a*b); //2
    System.out.println(a/b); //0
    System.out.println(a%b); //1

    /*Augmented Assignments    
    a = a + 10      a += 10
    a = a - 10      a -= 10
    a = a * 10      a *= 10
    a = a / 10      a /= 10
    a = a % 10      a %= 10 */
    
    int c = 3;
    
    c += 10;
    System.out.println(c);
    // c = 13, dst
    
    /*Unary Operator
    ++      a = a + 1
    --      a = a - 1
    -       Negative
    +       Positive
    !       Boolean kebalikan */

    int d = 4;

    d++;
    System.out.println(d); //5

    }
    
}
