package pertemuan11.tugas;

public class KaryawanTetap extends Karyawan implements Absensi {

    // Konstruktor, memanggil konstruktor superclass
    public KaryawanTetap(String nama) {
        super(nama);
    }

    // Implementasi method tampilkanInfo dari Karyawan
    @Override
    public void tampilkanInfo() {
        System.out.println("Karyawan Tetap: " + nama);
    }

    // Implementasi method masuk dari interface Absensi
    @Override
    public void masuk() {
        System.out.println(nama + " absen masuk jam 08:00");
    }

    // Implementasi method pulang dari interface Absensi
    @Override
    public void pulang() {
        System.out.println(nama + " absen pulang jam 17:00");
    }
}
