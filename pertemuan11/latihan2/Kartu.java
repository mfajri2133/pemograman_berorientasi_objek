package pertemuan11.latihan2;

public interface Kartu {
    // Method abstrak untuk otentikasi PIN
    public boolean otentikasi(String pin);
    // Method abstrak untuk mengenkripsi PIN
    public String encode(String pin);
}
