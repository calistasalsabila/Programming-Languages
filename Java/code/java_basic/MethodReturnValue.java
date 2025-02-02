public class MethodReturnValue {
    public static void main(String[] args) {

        var result = sum(100, 100);
        System.out.println(result);
        
        System.out.println(sum(100, 300));


        System.out.println(hitung(50, "+", 100));
        System.out.println(hitung(15, "*", 85)); // 0


    }
    
    static int sum (int value1, int value2) {
        var total = value1 + value2;
        return total;
    }

    static int hitung (int value1,String operasi, int value2) {
        switch (operasi) {
            case "+": 
                return value1 + value2;
            case "-" :
                return value1 - value2;
            default :
                return 0;

        }
    }
    
}
