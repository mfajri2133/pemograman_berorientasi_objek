package pertemuan5;

public class MatakuliahMain {
    public static void main(String[] args) {
        Matakuliah mk1 = new Matakuliah("001", "Algoritma Pemrograman 1", "A", 3);
        Matakuliah mk2 = new Matakuliah("002", "Algoritma Pemrograman 2", "BC", 3);
        Matakuliah mk3 = new Matakuliah("003", "Pemrograman Berorientasi Objek", "B", 3);

        System.out.println("--- DAFTAR MATAKULIAH ---");
        System.out.println(mk1.display());
        System.out.println(mk2.display());
        System.out.println(mk3.display());

        System.out.println("--- NILAI IPK ---");
        double totalBobot = (mk1.nilaiIndex() * mk1.getSKS()) +
                (mk2.nilaiIndex() * mk2.getSKS()) +
                (mk3.nilaiIndex() * mk3.getSKS());

        int totalSKS = mk1.getSKS() + mk2.getSKS() + mk3.getSKS();

        double ipk = totalBobot / totalSKS;
        System.out.println("IPK: " + ipk);

    }
}
