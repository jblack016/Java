public class TestBankAccount{

    public static void main(String[] args){

        System.out.println("Total Accounts: " + BankAccount.getNumOfAccounts());
        BankAccount user1 = new BankAccount();
        BankAccount user2 = new BankAccount();
        BankAccount user3 = new BankAccount();

        // Deposits

        user1.depositChecking(1000.00);
        user2.depositChecking(1.00);
        user3.depositSavings(500.00);
        user1.depositSavings(500.00);

        // Prints for Deposits

        System.out.println("User1 Checking: " + user1.getChecking());
        System.out.println("User1 Savings: " + user1.getSavings());
        System.out.println("User2 Checking: " + user2.getChecking());
        System.out.println("User3 Checking: " + user3.getChecking());

        // Withdraws

        user1.withdrawSavings(200);
        user2.withdrawSavings(200.00);

        // Prints for Withdraws

        System.out.println("User1 Checking: " + user1.getChecking());
        System.out.println("User1 Savings: " + user1.getSavings());
        System.out.println("User2: " + user2.getChecking());
        System.out.println("User2: " + user2.getSavings());

        // Total Prints

        System.out.println("Total Accounts: " + BankAccount.getNumOfAccounts());
        System.out.println("Total Money Stored: " + BankAccount.getTotalMoneyStored());
        System.out.println("User1 total: " + user1.getTotal());
        System.out.println("User2 total: " + user2.getTotal());
        System.out.println("User3 total: " + user3.getTotal());
    }
}