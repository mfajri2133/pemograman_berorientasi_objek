package pertemuan7;

public class Dosen {
    private String nidn;
    private String nama;

    public Dosen(String nidn, String nama) {
        this.nidn = nidn;
        this.nama = nama;
    }

    public String display(){
        return "Dosen Pengampu: " + nama + " (NIDN: " + nidn + ")";
    }
}
