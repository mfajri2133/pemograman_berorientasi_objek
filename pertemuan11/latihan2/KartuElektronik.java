package pertemuan11.latihan2;

public class KartuElektronik implements Kartu {
    private String KodeBank; //Atribut kode bank
    private String pin; // PIN asli

    // Konstruktor untuk inisialisasi kode bank dan pin
    public KartuElektronik(String KodeBank, String pin) {
        super();
        this.KodeBank = KodeBank;
        this.pin = pin;
    }

    // Implementasi otentikasi: cek apakah input pin sama dengan pin yang disimpan
    @Override
    public boolean otentikasi(String pinInput) {
        if (pinInput.equals(pin)) {
            return true;
        } else {
            return false;
        }
    }

    // Implementasi encode
    @Override
    public String encode(String pin){
        return null;
    }
}
