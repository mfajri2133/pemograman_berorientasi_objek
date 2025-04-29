package pertemuan9.tugas;

public class Pegawai {
    protected String nama;
    protected String nip;

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public String getNip() {
        return nip;
    }

    public void tampilData() {
        System.out.println("Nama: " + nama);
        System.out.println("NIP: " + nip);
    }
}
