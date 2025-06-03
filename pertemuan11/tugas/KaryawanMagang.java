package pertemuan11.tugas;

public class KaryawanMagang extends Karyawan implements Absensi {

    // Konstruktor, memanggil konstruktor superclass
    public KaryawanMagang(String nama) {
        super(nama);
    }

    // Implementasi method tampilkanInfo dari Karyawan
    @Override
    public void tampilkanInfo() {
        System.out.println("Karyawan Magang: " + nama);
    }

    // Implementasi method masuk dari interface Absensi
    @Override
    public void masuk() {
        System.out.println(nama + " absen masuk jam 09:00");
    }

    // Implementasi method pulang dari interface Absensi
    @Override
    public void pulang() {
        System.out.println(nama + " absen pulang jam 13:00");
    }
}
