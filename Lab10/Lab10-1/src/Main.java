public class Main {
    public static void main(String[] args) {
    Account a1 = new Account(5000, "Sommai");
    Account a2 = new Account(3000, "Somchai");
    Account a3 = new Account(900, "Somsri");
    Account a4 = new Account(1000, "Somsri");
    Account a5 = new Account(2100, "Somsri");
    Account a6 = new Account(2300, "Somsri");
    Account a7 = new Account(400, "Somsri");
    Account a8 = new Account(4100, "Somsri");
    Account a9 = new Account(8900, "Somsri");
    Account a10 = new Account(1100, "Somsri");
    Account a11 = new Account(1200000, "Somsri");

    Bank myBank = new Bank();
    myBank.addAccount(a1);
    myBank.addAccount(a2);
    myBank.addAccount(a3);
    myBank.addAccount(a4);
    myBank.addAccount(a5);
    myBank.addAccount(a6);
    myBank.addAccount(a7);
    myBank.addAccount(a8);
    myBank.addAccount(a9);
    myBank.addAccount(a10);
    myBank.addAccount(a11);

    System.out.println("Number of Account: " + myBank.getNumAccount());
    myBank.getAccount(0).showAccount();
    System.out.println("Deposit 500...");
    myBank.getAccount(0).deposit(500);
    myBank.getAccount(0).showAccount();
    System.out.println("Show all accounts");
    System.out.println("==============================");
    for(int i=0; i<myBank.getNumAccount(); i++){
    myBank.getAccount(i).showAccount();
        }
    }
}
