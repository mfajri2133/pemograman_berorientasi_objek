package pertemuan9.tugas;

public class PegawaiKontrak extends Pegawai {
    private double honor;

    public void setHonor(double honor) {
        this.honor = honor;
    }

    public double getHonor() {
        return honor;
    }

    public void tampilData() {
        super.tampilData();
        System.out.println("Honor: Rp " + honor);
    }
}
