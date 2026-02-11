class BankAccount {

    String accountHolder;
    double balance;

    BankAccount(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    void showDetails() {
        System.out.println("Holder: " + accountHolder);
        System.out.println("Balance: " + balance);
    }
}

public class BankAccounts {
    public static void main(String[] args) {

        BankAccount b1 = new BankAccount("Annanya", 5000);
        b1.showDetails();
    }
}
