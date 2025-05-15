package pertemuan11.tugas;

public abstract class Karyawan {
    protected String nama; // Atribut nama karyawan

    public Karyawan(String nama) {
        this.nama = nama;
    }

    // Method abstrak yang harus diimplementasikan oleh subclass
    public abstract void tampilkanInfo();
}
