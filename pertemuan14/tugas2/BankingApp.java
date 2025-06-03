package pertemuan14.tugas2;

public class BankingApp {
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("001", 1000.00);
        acc1.displayAccountInfo();
        acc1.deposit(200.00);
        acc1.displayAccountInfo();

        System.out.println();
        System.out.println("--- Membuat Akun Tabungan ---");
        SavingsAccount savingsAcc1 = new SavingsAccount("002", 2000.00);
        savingsAcc1.displaySavingsAccountDetails();
        savingsAcc1.deposit(1000.00);
        savingsAcc1.displaySavingsAccountDetails();

        System.out.println("--- Memanggil displayAccountInfo() pada SavingsAccount ---");
        savingsAcc1.displayAccountInfo();
    }
}
