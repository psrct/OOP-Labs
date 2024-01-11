public class Employee {
    private static String nationality = "Thai";
    private String name;
    private Wallet wallet;
    private int energy;
    
    public boolean equals(Employee e){
        return e.name.equals(this.name);
    }
    @Override
    public String toString(){
        return String.format("My name is %s.\nI have %d energy left.\nI have a balance of %.1f baht.", this.name, this.energy, wallet.getBalance());
    }
    public boolean buyFood(Seller s){
        Food f = s.sell(this);
        if (f != null){
            this.eat(f);
            return true;
        }else{
            return false;
        }
    }
    public void eat(Food f){
        this.energy += f.getEnergy();
    }
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }
    public Wallet getWallet(){
        return this.wallet;
    }
    public void setWallet(Wallet wallet){
        this.wallet = wallet;
    }
    public int getEnergy(){
        return this.energy;
    }
    public void setEnergy(int energy){
        this.energy = energy;
    }
    public static String getNationality(){
        return Employee.nationality;
    }
    public static void setNationality(String nationality){
        Employee.nationality = nationality;
    }
}
