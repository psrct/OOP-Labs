public class Owner {
    protected final String name;
    protected Animal animal;
    
    public Owner(){
        this("",null);
    }
    public Owner(String name){
        this.name = name;
    }
    public Owner(Animal animal){
        this.name = "";
        this.animal = animal;
    }
    public Owner(String name, Animal animal){
        this.name = name;
        this.animal = animal;
    }
    public String getName(){
        return this.name;
    }
    public void setAnimal(Animal animal){
        this.animal = animal;
    }
    public Animal getAnimal(){
        return this.animal;
    }
    public void feedFood(Food f){
        this.animal.eat(f);
    }
    @Override
    public String toString(){
        return String.format("Owner : name = %s, Animal : name = %s, power = %d, age = %d", this.getName(), animal.getName(), animal.getPower(), animal.getAge());
    }
    public void protectOwnerFrom(Animal a){

    }
}
