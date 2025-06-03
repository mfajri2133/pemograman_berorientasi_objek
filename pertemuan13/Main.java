package pertemuan13;

public class Main {
    public static void main(String[] args) {
        Lingkaran lingkaran = new Lingkaran(7);
        Tabung tabung = new Tabung(7, 10);
        
        System.out.println("Luas Lingkaran: " + lingkaran.hitungLuas());
        System.out.println("Luas Tabung: " + tabung.hitungLuas());
    }
}
