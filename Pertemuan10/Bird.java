package Pertemuan10;

public class Bird  extends Hewan implements Flyable{


    public void fly(){
        System.out.println("Burung terbang menggunakan sayap.");
    }

    @Override
    void sound() {
        System.out.println("Petok petok.");
    }
}
