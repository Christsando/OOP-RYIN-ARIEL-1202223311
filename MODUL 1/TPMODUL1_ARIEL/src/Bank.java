import java.util.List;
import java.util.ArrayList;
// List Import Library

// Add account      -> DONE
// Remove Account   ->
// Get Account      ->
// Get All Account  -> DONE

public class Bank {
    private Account account;
    List<Account> Account_list = new ArrayList<Account>();
    // Account storage

    public void Add_account(Account account){
        // Create new account or add account that already exist
        Account_list.add(account);
    }

    public void Remove_account(int accNumber) {
        for (Account account : Account_list)
            if (account.getNumber() == accNumber) {
                Account_list.remove(account);
                System.out.println("Akun " + account.getName() + " telah dihapus.");
                return;
            }
    }

    public Account getAccount(int accNumber){
        for (Account account : Account_list) {
            if (account.getNumber() == accNumber) {
                return account;
            }
        }
        return null;
    }

    public void getAllaccount(){
        // Show all account name
        System.out.println("Account list : ");
        for (int x = 0; x < Account_list.size(); x++){
            System.out.println((x + 1) + ". " + Account_list.get(x));
        }
    }
}
