public class Main {
    public static void main(String[] args) {
        // Bank instance
        Bank bank = new Bank();

        // Account identity
        Account acc1 = new Account("Ariel_SI4609", 1202223311, 150000);
        Account acc2 = new Account("David", 1118899810, 1200000);
        Account acc3 = new Account("Ola", 1412939283, 10000000);

        // Deposit
        acc1.Deposit(300000);
        acc2.Deposit(150000);
        acc3.Deposit(100000);

        // Space
        System.out.println(" ");

        // Withdraw
        acc1.Withdraw(470000);
        acc2.Withdraw(150000);
        acc3.Withdraw(210000);

        // Space
        System.out.println(" ");

        // Get account by looping


        // Space
        System.out.println(" ");

        // Add account to storage
        bank.Add_account(acc1.toString());
        bank.Add_account(acc2.toString());
        bank.Add_account(acc3.toString());

        // Show all account in account storage
        bank.getAllaccount();
    }
}