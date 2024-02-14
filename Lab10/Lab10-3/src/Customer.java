import java.util.*;
public class Customer {
    private String firstName;
    private String lastName;
    private ArrayList acct;

    public Customer(){
        this("", "");
    }
    public Customer(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        acct = new ArrayList();
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
        return (Account)acct.get(index);
    }
    public void addAccount(Account ac){
        acct.add(ac);
    }
    public int getNumOfAccount(){
        return acct.size();
    }
}
