package pertemuan14.tugas5;

public class TestMahasiswa {
    public static void main(String[] args) {
        Mahasiswa m1 = new Mahasiswa("233040105", "Muhamad Fajri");
        Mahasiswa m2 = new Mahasiswa("233040110", "Raihan Fadhil");
        Mahasiswa m3 = new Mahasiswa("233040999", "Khanisya Sanshatzi Dhia");

        System.out.println("\n--- Menampilkan Informasi Masing-Masing Mahasiswa ---");
        m1.displayInfo();
        m2.displayInfo();
        m3.displayInfo();

        System.out.println("\n--- Total Pendaftar Mahasiswa ---");
        // Menampilkan total pendaftar mahasiswa dengan memanggil method static
        System.out.println("Total mahasiswa yang telah terdaftar: " + Mahasiswa.getTotalMahasiswa());
    }
}
