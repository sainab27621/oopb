package chap5;

public class BankAccount {

    private int accountNo;
    private String accountName;
    private double balance;

    public BankAccount(int accountNo, String accountName, double balance) {
        this.accountNo = accountNo;
        this.accountName = accountName;
        this.balance = balance;
    }

    public int getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(int accountNo) {
        this.accountNo = accountNo;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        System.out.println("ฝากเงิน จำนวน :" + amount);
        balance = balance + amount;
    }

    public void withdraw(double amount) {
        System.out.println("ถอนเงิน จำนวน :" + amount);
        balance = balance - amount;
    }

    public void printDetails() {
        System.out.println("**********************");
        System.out.println("เลขที่บัญชี : " + accountNo);
        System.out.println("ชื่อบัญชี :" + accountName);
        System.out.println("คงเหลือ :" + balance);
        System.out.println("**********************");
    }

}
