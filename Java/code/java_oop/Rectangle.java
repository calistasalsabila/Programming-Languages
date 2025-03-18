class rectangle1 {
    int getCorner(){
        return 0;
    }
}
class area extends rectangle1{
    int getCorner(){
        return 4;
    }
    int getParentCorner(){
        return super.getCorner();
    }
}


public class Rectangle {
    public static void main(String[] args) {
        var a = new area();
        System.out.println(a.getCorner());
        System.out.println(a.getParentCorner());


        var b = new rectangle1();
        System.out.println(b.getCorner());

    }
    
}
