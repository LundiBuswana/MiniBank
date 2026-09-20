public class Transaction {

    private String transactionId;
    private String accountNumber;
    private String type;
    private double amount;
    int x=1;

    public Transaction(String transactionId, String accountNumber, String type, double amount) {
        this.transactionId = transactionId;
        this.accountNumber = accountNumber;
        this.type = type;
        this.amount = amount;
    }

    public String transactionId() {
        return transactionId;
    }


    private String generateNextID(){

        transactionId="T00"+x;
        x++;
        return transactionId;

    }


    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public String accountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String type() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double amount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}