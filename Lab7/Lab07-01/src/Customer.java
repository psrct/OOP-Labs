public class Customer {
    private String firstName;
    private String lastName;
    private CheckingAccount acct;
    
    public Customer(){
        this("", "");
    }
    public Customer(String firstName, String lastName, CheckingAccount acct){
        this.firstName = firstName;
        this.lastName = lastName;
        this.acct = acct;
    }
    public Customer(String firstName, String lastName){
        this(firstName, lastName, null);
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public String getFirstName(){
        return this.firstName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public String getLastName(){
        return this.lastName;
    }
    public void setAcct(CheckingAccount acct){
        this.acct = acct;
    }
    public CheckingAccount getAcct(){
        return this.acct;
    }
    @Override
    public String toString(){
        if (this.getAcct() == null){
            return String.format("%s %s doesn’t have account.", this.getFirstName(), this.getLastName());
        } else {
            return String.format("The %s account has %.1f baht and %.1f credits.", this.getFirstName(), acct.getBalance(), acct.getCredit());
        }
    }
    public boolean equals(Customer c){
        return (((this.getFirstName().equals(c.getFirstName()))) & (this.getLastName().equals(c.getLastName())));
    }
}