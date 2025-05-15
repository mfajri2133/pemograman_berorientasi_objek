package pertemuan11.latihan2;

public class InterfaceMain {
    public static void main(String[] args) {
        // Membuat objek KartuElektronik dengan kode bank dan pin
        KartuElektronik kartu = new KartuElektronik("IF111", "123");
        // Melakukan otentikasi dengan input PIN
        System.out.println("Otentikasi: " + kartu.otentikasi("123")); // karena pin dan pinInputnya sama maka menghasilkan true
    }
}
