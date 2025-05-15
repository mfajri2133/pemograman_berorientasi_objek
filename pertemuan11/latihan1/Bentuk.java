package pertemuan11.latihan1;

public abstract class Bentuk {
    // Konstanta PI
    protected double PHI = 3.14;
    // Atribut jari-jari
    protected int jari2;

    // Konstruktor untuk menginisialisasi jari-jari
    public Bentuk(int jari2) {
        super();
        this.jari2 = jari2;
    }

    // Method abstrak luas() yang wajib diimplementasikan oleh subclass
    public abstract double luas();

    // Getter jari2
    public int getJari2() {
        return jari2;
    }

    // Setter jari2
    public void setJari2(int jari2) {
        this.jari2 = jari2;
    }
}
