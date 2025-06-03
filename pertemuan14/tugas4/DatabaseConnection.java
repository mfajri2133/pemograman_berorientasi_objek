package pertemuan14.tugas4;

public class DatabaseConnection {
    public static String connectionString;

    static {
        System.out.println("Static block DatabaseConnection sedang dijalankan...");
        String dbHost = "localhost";
        String dbPort = "8000";
        String dbName = "databaseContoh";
        String dbUser = "root";
        connectionString = "jdbc:postgresql://" + dbHost + ":" + dbPort + "/" + dbName + "?user=" + dbUser;
        System.out.println("Inisialisasi connectionString selesai.");
    }
}
