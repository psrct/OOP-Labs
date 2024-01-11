public class SeniorProgrammer extends Programmer{
    @Override
    public void coding(String str){
        if (this.getEnergy() >= 10) {
            System.out.println("I'm coding about " + str);
            this.setEnergy(this.getEnergy() - 5);
            this.setHappiness(this.getHappiness()- 5);
        }else{
            System.out.println("ZzZzZz");
            this.setEnergy(this.getEnergy() - 5);
            this.setHappiness(this.getHappiness()- 5);
        }
    }
    public void coding(String str, int num){
        if (this.getEnergy() >= 10) {
            for (int i = 1; i <= num;i++){
                System.out.println("I'm coding about " + str);
                this.setEnergy(this.getEnergy() - 5);
                this.setHappiness(this.getHappiness()- 5);}
        }else{
            for (int i = 1; i < num;i++)
                System.out.println("ZzZzZz");
                this.setEnergy(this.getEnergy() - 5);
                this.setHappiness(this.getHappiness()- 5);}
    }
    public void compliment(Programmer p){
        p.setHappiness(p.getHappiness() + 20);
        System.out.println(p.getName() + " in a good mood");
    }
    public void blame(Programmer p){
        p.setHappiness(p.getHappiness() - 20);
        System.out.println(p.getName() + " in a bad mood");
    }
}
