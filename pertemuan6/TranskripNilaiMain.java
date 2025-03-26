package pertemuan6;

import pertemuan5.Matakuliah;

public class TranskripNilaiMain {
    public static void main(String[] args) {
        Matakuliah mk1 = new Matakuliah("001", "Algoritma Pemrograman 1", "A", 3);
        Matakuliah mk2 = new Matakuliah("002", "Algoritma Pemrograman 2", "A", 3);
        Matakuliah mk3 = new Matakuliah("003", "Pemrograman Berorientasi Objek", "A", 3);

        KartuHasilStudi khs = new KartuHasilStudi("20222");
        khs.addMataKuliah(mk1);
        khs.addMataKuliah(mk2);
        khs.addMataKuliah(mk3);
        khs.hitungIPS();

        Mahasiswa mhs = new Mahasiswa("233040105", "Muhamad Fajri");

        TranskripNilai transkrip = new TranskripNilai(mhs);
        transkrip.addKRS(khs);
        transkrip.display();
    }
}
