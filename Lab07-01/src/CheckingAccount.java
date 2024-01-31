public class CheckingAccount extends Account{
    private double credit;
    public CheckingAccount(){
        this(0, "", 0);
    }
    public CheckingAccount(double balance, String name, double credit){
        super(balance, name);
        this.credit = credit;
    }
    public void setCredit(double credit){
        if (credit > 0){
            this.credit = credit;
        }else {
            System.out.println("Input number must be a positive integer.");
        }
    }
    public double getCredit(){
        return this.credit;
    }
    @Override
    public void withdraw(double a){
        if (a > 0){
            double money = (this.balance - a);
            if (money >= 0){
                this.setBalance((this.balance - a));
                System.out.println(String.format("%.1f baht is withdrawn from %s and your credit balance is %.1f.", a, this.getName(), this.getCredit()));
            } else if ((money < 0) & ((money + this.credit) >= 0)){
                this.setBalance(0);
                this.setCredit((this.credit - a));
                System.out.println(String.format("%.1f baht is withdrawn from %s and your credit balance is %.1f.", a, this.getName(), this.getCredit()));
            } else if ((money < 0)&((money + this.credit) < 0)){
                System.out.println("Not enough money!");
            }
        }
    }
    public void withdraw(String a){
        this.withdraw(Double.parseDouble(a));
    }
    @Override
    public String toString(){
        return String.format("The %s account has %.1f baht and %.1f credits.", this.getName(), this.getBalance(), this.getCredit());
    }
}
