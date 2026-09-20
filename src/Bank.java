import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Bank {

    Map<String, Account>peopleAccounts;
    public Bank(){
       this.peopleAccounts=new HashMap<>();
    }

    public void addAccount(Account account){
        peopleAccounts.put(account.accountNo(),account);
    }

    public Account getAccount(String AccNo){
        if(peopleAccounts.containsKey(AccNo)){
            return peopleAccounts.get(AccNo);
        }
        return null;
    }

    public void displayAllAccounts(){
        System.out.println("\n-----------All Bank Accounts--------\n");
        for(Map.Entry<String,Account>entry:peopleAccounts.entrySet()){
            System.out.println("Account: "+entry.getKey()+" Owner: "+entry.getValue().accOwner()+" Balance: "+entry.getValue().balance());
        }
    }


}
