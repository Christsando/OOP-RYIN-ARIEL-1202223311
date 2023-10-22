import java.util.List;
import java.util.ArrayList;
// List Import Library

// Add account      -> DONE
// Remove Account   ->
// Get Account      ->
// Get All Account  -> DONE

public class Bank {
    private Account account;
    List<String> Account_list = new ArrayList<String>();
    // Account storage

    public void Add_account(String bank_account){
        // Create new account or add account that already exist
        Account_list.add(bank_account);
    }

    public void Remove_account(){

    }

    public void getAccount(){

    }

    public void getAllaccount(){
        // Show all account name
        System.out.println("Account list : ");
        for (int x = 0; x < Account_list.size(); x++){
            System.out.println((x + 1) + ". " + Account_list.get(x));
        }
    }
}
