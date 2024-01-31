public class Dog extends Animal{
    public Dog(){
        super("", 0, 0);
    }
    public Dog(String name, int age){
        this.setName(name);
        this.setAge(age);
        this.setPower(200);
    }
    @Override
    public void eat(Food f){
        this.setPower((this.getPower() + f.getPower()));
    }
    public void kick(Animal a){
        a.setPower((a.getPower()- 10));
    }
}
