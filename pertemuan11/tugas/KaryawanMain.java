package pertemuan11.tugas;

public class KaryawanMain {
    public static void main(String[] args) {
        // Membuat objek karyawan tetap
        KaryawanTetap k1 = new KaryawanTetap("Fajri");

        KaryawanMagang k2 = new KaryawanMagang("Raihan");
        // Menampilkan informasi karyawan
        k1.tampilkanInfo();
        k1.masuk();
        k1.pulang();

        System.out.println(" ");

        k2.tampilkanInfo();
        k2.masuk();
        k2.pulang();
    }
}
