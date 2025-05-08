class ORV {
    String name;
    String title;
    
}

final class Dokja extends ORV {
    void title() {
        System.out.println("Dokja koma");
    }
}

// class Jeha extends Dokja {

// } ERROR

class Constellation {
    final void say() {
        System.out.println("Dokja wake up!!!!");
    }
}

class Hades extends Constellation {
    // void say() {
    // } ERROR
}




