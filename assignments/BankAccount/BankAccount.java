public class BankAccount{
    // attributes
    private double checking;
    private double savings;
    private static int numOfAccounts = 0;
    private static int totalMoneyStored = 0;

    // constructors

    // increments account count

    public BankAccount(){
    numOfAccounts++;
}

    // getters & setters

    public static int getNumOfAccounts(){
        return numOfAccounts;
    }

    public static int getTotalMoneyStored(){
        return totalMoneyStored;
    }

    public double getChecking(){
        return this.checking;
    }

    public double getSavings(){
        return this.savings;
    }

    public double getTotal(){
        double total = this.checking + this.savings;
            return total;
    }

    // Deposit methods

    public void depositChecking(double checkingMoney){
        this.checking += checkingMoney;
        totalMoneyStored += checkingMoney;
    }

    public void depositSavings(double savingsMoney){
        this.savings += savingsMoney;
        totalMoneyStored += savingsMoney;
    }

    // Withdraw methods

    public void withdrawChecking(double withdrawnCheckingMoney){
        if(this.checking < withdrawnCheckingMoney){
            System.out.println("Not enough funds in checking");
        } else{
            this.checking -= withdrawnCheckingMoney;
            totalMoneyStored -= withdrawnCheckingMoney;
        }
    }

        public void withdrawSavings(double withdrawnSavingsMoney){
        if(this.savings < withdrawnSavingsMoney){
            System.out.println("Not enough funds in savings");
        } else{
            this.savings -= withdrawnSavingsMoney;
            totalMoneyStored -= withdrawnSavingsMoney;
        }
    }
}
