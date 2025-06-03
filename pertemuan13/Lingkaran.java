package pertemuan13;

public class Lingkaran {
    private double radius;

    public Lingkaran(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double hitungLuas() {
        return Math.PI * radius * radius;
    }
}
