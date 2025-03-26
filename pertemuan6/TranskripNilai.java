package pertemuan6;

import pertemuan5.Matakuliah;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TranskripNilai {
    private Date tglCetak;
    private double ipk = 0.0;
    private List<KartuHasilStudi> kartuHasilStudi;
    private Mahasiswa mahasiswa;

    public TranskripNilai(Mahasiswa mahasiswa) {
        super();
        this.mahasiswa = mahasiswa;
        this.kartuHasilStudi = new ArrayList<>();
        this.tglCetak = new Date();
    }

    public void addKRS(KartuHasilStudi khs){
        kartuHasilStudi.add(khs);
    }

    public void hitungIPK(){
        double totalBobot = 0;
        int totalSKS = 0;

        for (KartuHasilStudi khs : kartuHasilStudi) {
            for (Matakuliah mk : khs.getDaftarMatakuliah()) {
                totalBobot += mk.nilaiIndex() * mk.getSKS();
                totalSKS += mk.getSKS();
            }
        }

        ipk = (totalSKS > 0) ? totalBobot / totalSKS : 0;
    }

    public void display(){
        System.out.println(mahasiswa.display());
        System.out.println("Tanggal Cetak: " + tglCetak.toString());
        hitungIPK();
        System.out.println("IPK: " + ipk);
        for (KartuHasilStudi khs : kartuHasilStudi) {
            System.out.println(khs.display());
        }
    }
}
