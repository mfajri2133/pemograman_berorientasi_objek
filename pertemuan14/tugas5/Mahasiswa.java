package pertemuan14.tugas5;

public class Mahasiswa {
    final String nim;
    String nama;
    static int totalMahasiswa;
    static final int MAX_SKS = 24;

    public Mahasiswa(String nim, String nama) {
        this.nim = nim;
        this.nama = nama;
        totalMahasiswa++;
        System.out.println("Mahasiswa baru terdaftar: " + this.nama + " (NIM: " + this.nim + ")");
    }

    public static int getTotalMahasiswa() {
        return totalMahasiswa;
    }

    public void displayInfo() {
        System.out.println("-----------------------------");
        System.out.println("Informasi Detail Mahasiswa:");
        System.out.println("NIM: " + this.nim);
        System.out.println("Nama: " + this.nama);
        System.out.println("Maksimum SKS per semester: " + MAX_SKS);
        System.out.println("-----------------------------");
    }
}
