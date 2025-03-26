package pertemuan6;

public class Mahasiswa {
    private String NRP;
    private String nama;

    public Mahasiswa(String NRP, String nama) {
        super();
        this.NRP = NRP;
        this.nama = nama;
    }

    public String display(){
        return "NRP: " + NRP + ", Nama: " + nama;
    }
}
