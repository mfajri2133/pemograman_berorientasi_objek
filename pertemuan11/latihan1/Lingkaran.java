package pertemuan11.latihan1;

public class Lingkaran extends Bentuk {
    // Konstruktor Lingkaran, memanggil konstruktor Bentuk
    public Lingkaran(int jari2) {
        super(jari2);
    }

    // Implementasi method luas() sesuai rumus lingkaran: π × r²
    @Override
    public double luas(){
        return PHI * jari2 * jari2;
    }
}
