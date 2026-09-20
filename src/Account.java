import java.util.ArrayList;
import java.util.List;

public class Account {
    private final String accountNo;
    private final String accOwner;
    private double balance;
    private List<Transaction> transactionList;

    public Account(String accountNo, String accOwner, double balance) {
        this.accountNo = accountNo;
        this.accOwner = accOwner;
        this.balance = balance;
        transactionList=new ArrayList<>();
    }


    public void addTransaction(Transaction transaction){
        transactionList.add(transaction);
    }

    public List<Transaction> transactionList() {
        return transactionList;
    }

    public String accountNo() {
        return accountNo;
    }

    public String accOwner() {
        return accOwner;
    }

    public double balance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount){
        if(amount > 0){
            balance += amount;
            Transaction tempTransact=new Transaction("T001","1001", "deposit",amount);
            addTransaction(tempTransact);
        }
        else{
            System.out.println("The amount you deposit must be greater than 0");
        }
    }

    public void withDraw(double amount){
        if(amount > 0 && amount <= balance){
            balance -= amount;
            Transaction tempTransact=new Transaction("T001","1001", "withdraw",amount);
            addTransaction(tempTransact);
        }
        else{
            System.out.println("Cannot withdraw that amount.");
        }
    }
}
