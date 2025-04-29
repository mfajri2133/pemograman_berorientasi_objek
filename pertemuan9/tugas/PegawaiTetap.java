package pertemuan9.tugas;

public class PegawaiTetap extends Pegawai {
    private double gaji;

    public void setGaji(double gaji) {
        this.gaji = gaji;
    }

    public double getGaji() {
        return gaji;
    }

    public void tampilData() {
        super.tampilData();
        System.out.println("Gaji: Rp " + gaji);
    }
}
