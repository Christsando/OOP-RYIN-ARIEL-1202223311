// Deposit  -> DONE
// Withdraw -> DONE

public class Account {
    private String Account_name;
    private int Account_number, Account_balance;

    public Account(String Account_name, int Account_number, int Account_balance){
        // Initialize Variable
        this.Account_name = Account_name;
        this.Account_number = Account_number;
        this.Account_balance = Account_balance;
    }

    public String getName() {
        // Name account getter
        return Account_name;
    }

    public int getBalance() {
        // Balance account getter
        return Account_balance;
    }

    public int getNumber() {
        return Account_number;
    }

    public void Deposit(int money){
        // Money +
        Account_balance += money;
        System.out.println(Account_name + ", has just deposit money : " + money + ", balance now : " + Account_balance);
    }
    public boolean Withdraw(int money){
        // Money -
        // Execute if balance bigger than money
        if (Account_balance > money){
            System.out.println(getName() + ", Just withdraw money : " + money + ", balance now : " + getBalance());
            return true;
        }
        // Execute when balance smaller than money
        else {
            System.out.println(getName() + ", withdraw failed. Insufficient balance! You only have : " + getBalance());
            return false;
        }
    }

    public String toString(){
        return ("Account name : " + getName() + " || Account number : " + getNumber()
        + " || Balance : " + getBalance());
    }
}
