package pertemuan3;

public class Lingkaran {
    double jari2;
    double phi;

    public Lingkaran(double jari, double phi) {
        this.jari2 = jari;
        this.phi = phi;
    }

    public double hitungJari(){
        return phi * jari2 * jari2;
    }

    
}
