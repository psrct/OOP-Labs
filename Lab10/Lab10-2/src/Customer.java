public class Customer {
    private String firstName;
    private String lastName;
    private Account acct[];
    private int numOfAccount;

    public Customer(){
        this("", "");
    }
    public Customer(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        acct = new Account[5];
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
    @Override
    public String toString(){
        return String.format("%s %s has %d accounts.", this.getFirstName(), this.getLastName(), this.getNumOfAccount());
    }
    public boolean equals(Customer c){
        return (((this.getFirstName().equals(c.getFirstName()))) & (this.getLastName().equals(c.getLastName())));
    }
    public Account getAccount(int index){
        return acct[index];
    }
    public void addAccount(Account ac){
        if (this.getNumOfAccount()>= 10){
            System.out.println("Full can't insert");
        }else{
            for (int i=0; i<10; i++){
                if (acct[i] == null){
                    acct[i] = ac;
                    this.numOfAccount += 1;
                    break;
                }
            }
        }
    }
    public int getNumOfAccount(){
        return this.numOfAccount;
    }
}
