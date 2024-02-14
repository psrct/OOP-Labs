public class Account {
    protected double balance;
    protected String name;

    public Account(double balance, String name){
        this.name = name;
        this.balance = balance;
    }
    public void deposit(double a){
        if (a > 0){
            this.setBalance((this.balance + a));
            System.out.println(String.format("%.1f baht is deposited to %s.", a, this.getName()));
        }else {
            System.out.println("Input number must be a positive integer.");
        }
    }
    public void withdraw(double a){
        if ((a > 0)&((this.balance - a) > 0)){
            this.setBalance((this.balance - a));
            System.out.println(String.format("%.1f baht is withdrawn from %s.", a, this.getName()));
        } else if (a<0){
            System.out.println("Input number must be a positive integer.");
        } else if (((this.getBalance() - a)<0)){
            System.out.println("Not enough money!");
        }
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public void setBalance(double balance){
        this.balance = balance;
    }
    public double getBalance(){
        return this.balance;
    }
    public void showAccount(){
        System.out.println(String.format("%s account has %.1f baht.", this.getName(), this.getBalance()));
    }
}
