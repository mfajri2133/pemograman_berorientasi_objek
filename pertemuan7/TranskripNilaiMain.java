package pertemuan7;

public class TranskripNilaiMain {
    public static void main(String[] args) {
        Dosen d1 = new Dosen("100325", "Ir. Siti Aminah");
        Dosen d2 = new Dosen("100333", "Dr. Bobon Santoso");
        Matakuliah mk1 = new Matakuliah("001", "Algoritma Pemrograman 1", "A", 3, d2);
        Matakuliah mk2 = new Matakuliah("002", "Algoritma Pemrograman 2", "AB", 3, d2);
        Matakuliah mk3 = new Matakuliah("003", "Pemrograman Berorientasi Objek", "B", 3, d1);

        KartuHasilStudi khs = new KartuHasilStudi("2025");
        khs.addMataKuliah(mk1);
        khs.addMataKuliah(mk2);
        khs.addMataKuliah(mk3);
        khs.hitungIPS();

        Mahasiswa mhs = new Mahasiswa("233040105", "Muhamad Fajri");
        TranskripNilai transkrip = new TranskripNilai(mhs, "Smester Ganjil 2025");
        transkrip.addKRS(khs);
        transkrip.display();
    }
}
