import java.util.*;

public class Main {
    public static void main(String[] args) {
        Bank miniBank = new Bank();
        miniBank.peopleAccounts.put("1001", new Account("1001","John",5000));
        miniBank.peopleAccounts.put("1002", new Account("1002","Jack",12000));
        miniBank.peopleAccounts.put("1003", new Account("1003","Jimmy",700));
        miniBank.peopleAccounts.put("1004", new Account("1004","Lisa",2500));
        miniBank.peopleAccounts.put("1005", new Account("1005","Mark",3500));


        Set<String>transactionSet=new HashSet<>();
        transactionSet.add("T001");
        transactionSet.add("T005");
        transactionSet.add("T002");
        transactionSet.add("T003");
        transactionSet.add("T001");
        transactionSet.add("T004");


        Set<String>accountNumbers=new TreeSet<>();
        accountNumbers.add("1001");
        accountNumbers.add("1005");
        accountNumbers.add("1002");
        accountNumbers.add("1004");
        accountNumbers.add("1003");
        accountNumbers.add("1001");
        accountNumbers.add("1002");

        //finding transaction>R500
        Account account=miniBank.peopleAccounts.get("1001");
        account.deposit(900);
        account.deposit(100);
        account.withDraw(200);
        account.deposit(800);
        account.withDraw(2500);
        List<Transaction>transactions=account.transactionList();
        transactions.stream().filter(num->num.amount()>500).forEach(transaction -> {
            System.out.println("Account number "+transaction.accountNumber()+" Transaction ID: "+transaction.transactionId()+" "+ transaction.type()+" R"+transaction.amount());
        });

        //Filter Transaction by Type:
        long countDep=transactions.stream().filter(transaction -> transaction.type().equalsIgnoreCase("deposit")).count();
        transactions.stream().filter(transaction -> transaction.type().equalsIgnoreCase("deposit")).forEach(transaction -> {

            System.out.println("We have "+countDep+" "+transaction.type()+" transaction");
        });

        long countWith=transactions.stream().filter(transaction -> transaction.type().equalsIgnoreCase("withdraw")).count();
        transactions.stream().filter(transaction -> transaction.type().equalsIgnoreCase("withdraw")).forEach(transaction -> {

            System.out.println("We have "+countWith+" "+transaction.type()+" transaction");
        });

    }

}
