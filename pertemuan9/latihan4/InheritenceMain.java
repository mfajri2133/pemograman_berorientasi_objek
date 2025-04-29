package pertemuan9.latihan4;

public class InheritenceMain {
    public static void main(String[] args) {
        Mahasiswa mhs = new Mahasiswa("233040105", "Muhamad Fajri", "Bandung");
        System.out.println(mhs.getNrp() + " " + mhs.getNama() + " " + mhs.getAlamat());
    }
}
