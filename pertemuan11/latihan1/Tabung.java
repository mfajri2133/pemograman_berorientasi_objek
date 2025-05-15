package pertemuan11.latihan1;

public class Tabung extends Bentuk {
    // Atribut tinggi
    private int tinggi;

    // Konstruktor dengan parameter jari-jari dan tinggi
    public Tabung(int jari2 ,int tinggi) {
        super(jari2);
        this.tinggi = tinggi;
    }

    // Implementasi method luas() sesuai rumus luas permukaan tabung
    @Override
    public double luas() {
        return 2 * PHI * jari2 * (jari2 + tinggi);
    }

    // Getter tinggi
    public int getTinggi() {
        return tinggi;
    }

    // Setter tinggi
    public void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }
}
