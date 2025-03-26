package pertemuan2;
import pertemuan2.Ball;
import pertemuan3.Lingkaran;
import pertemuan3.Mahasiswa;

public class Main {
    public static void main(String[] args) {

        Ball myBall1 = new Ball("green", 12, true);
        Ball myBall2 = new Ball("yellow", 18, false);

        Mahasiswa m1 = new Mahasiswa("233040105", "Muhamad Fajri", "Purwakarta");

        System.out.println(m1.alamat);


    }
}
