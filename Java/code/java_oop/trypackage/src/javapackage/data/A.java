package javapackage.data;

public class A {
    String name;
    int nim;

    public A(String name, int nim) {
        this.name = name;
        this.nim = nim;
    }

    public void show() {
        System.out.println("Nama: " + name + ", NIM: " + nim);
    }
}
