package pertemuan13;

public class Tabung extends Lingkaran {
    private double tinggi;

    public Tabung(double radius, double tinggi) {
        super(radius);
        this.tinggi = tinggi;
    }

    public double getTinggi() {
        return tinggi;
    }

    @Override
    public double hitungLuas() {
        return 2 * Math.PI * getRadius() * getRadius() + 2 * Math.PI * getRadius() * tinggi;
    }
}
