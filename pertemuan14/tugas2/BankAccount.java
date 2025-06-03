package pertemuan14.tugas2;

public class BankAccount {
    final String accountNumber;
    double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public final void displayAccountInfo(){
        System.out.println("Nomor Akun: " + accountNumber);
        System.out.println("Saldo: " + balance);
    }
}
