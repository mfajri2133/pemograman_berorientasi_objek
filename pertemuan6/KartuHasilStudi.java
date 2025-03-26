package pertemuan6;

import pertemuan5.Matakuliah;
import java.util.ArrayList;
import java.util.List;

public class KartuHasilStudi {
    private String semester;
    private double ips;
    private List<Matakuliah> daftarMatakuliah;

    public KartuHasilStudi(String semester) {
        this.semester = semester;
        this.daftarMatakuliah = new ArrayList<>();
    }

    public List<Matakuliah> getDaftarMatakuliah() {
        return daftarMatakuliah;
    }

    public void addMataKuliah(Matakuliah matakuliah){
        daftarMatakuliah.add(matakuliah);
    }

    public String display(){
        StringBuilder sb = new StringBuilder();
        for (Matakuliah mk : daftarMatakuliah){
            sb.append(mk.display());
            sb.append("\n");
        }
        return sb.toString();
    }

    public void hitungIPS(){
        double totalBobot = 0;
        int totalSKS = 0;

        for (Matakuliah mk : daftarMatakuliah) {
            totalBobot += mk.nilaiIndex() * mk.getSKS();
            totalSKS += mk.getSKS();
        }

        ips = (totalSKS > 0) ? totalBobot / totalSKS : 0;
    }
}
