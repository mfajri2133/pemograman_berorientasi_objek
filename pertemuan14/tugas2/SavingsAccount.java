package pertemuan14.tugas2;

class SavingsAccount extends BankAccount {
   final double interestRate = 0.05;
    public SavingsAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    // Karena tidak bisa langsung overide final maka bisa kita buatkan
    // method baru yang memanggil method final tersebut
//    @Override
//    public void displayAccountInfo() {
//        System.out.println("Ini adalah rekening tabungan.");
//        super.displayAccountInfo();
//    }

    public void displaySavingsAccountDetails() {
        System.out.println("--- Detail Rekening Tabungan ---");
        super.displayAccountInfo();
        System.out.println("Suku Bunga Tahunan: " + this.interestRate + "%");
        System.out.println("-------------------------------");
    }
}