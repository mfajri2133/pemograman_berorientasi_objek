package pertemuan11.latihan1;

public class Main {
    public static void main(String[] args) {
        // Membuat objek Lingkaran dengan jari-jari 10
        Lingkaran l = new Lingkaran(10);

        // Membuat objek Tabung dengan jari-jari 10 dan tinggi 5
        Tabung t = new Tabung(10,5);

        // Menampilkan data Lingkaran
        System.out.println("== Lingkaran ==");
        System.out.println("Jari2: " + l.getJari2());
        System.out.println("Luas: " + l.luas());

        // Menampilkan data Tabung
        System.out.println("== Tabung ==");
        System.out.println("Jari2: " + t.getJari2() + ", Tinggi: " + t.getTinggi());
        System.out.println("Luas: " + t.luas());
    }
}

/*
Jawaban pertanyaan pada Latihan 1
    1. Method abstract yang digunakan pada kelas bentuk adalah 'public abstrac double luas();'
    2. Jika di kelas bentuk method luas() itu adalah abstrak yang tidak punya isi.
       sedangkan di Lingkaran dan Tabung method luas() di override dan diisi dengan
       logika perhitungan sesuai rumus dari bentuk masing masing.
    3. Jika method luas() dihilangkan maka akan error karena tabung meng-extends bentuk yang
       dimana wajib memasukan method luas() jika tidak dimasukan akan error
    4. Sudah ada di kode main
    5. Gambar sudah saya lampirkan di folder latihan1
 */
