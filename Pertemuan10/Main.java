package Pertemuan10;

public class Main {
    public static void main(String[] args) {
        Kucing k = new Kucing();

        k.sound();
        k.eat();

        Bird b = new Bird();

        b.fly();
        b.sound();
        b.eat();

        Airplane a = new Airplane();
        a.fly();

    }
}
