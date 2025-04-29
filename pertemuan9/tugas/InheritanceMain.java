package pertemuan9.tugas;

public class InheritanceMain {
    public static void main(String[] args) {
        PegawaiTetap tetap = new PegawaiTetap();
        tetap.setNama("Muhamad Fajri");
        tetap.setNip("233040105");
        tetap.setGaji(5000000);
        System.out.println("Data Pegawai Tetap:");
        tetap.tampilData();

        System.out.println();

        PegawaiKontrak kontrak = new PegawaiKontrak();
        kontrak.setNama("Raihan");
        kontrak.setNip("233040110");
        kontrak.setHonor(3000000);
        System.out.println("Data Pegawai Kontrak:");
        kontrak.tampilData();
    }
}
