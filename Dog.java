public class Dog extends Animal {
    public Dog(){
        super(123, "rex", 8, 23.5);
        this.getHabilidades().add("sniff");
    }
    @Override
    public String som(){
        return "au au";
    }
}
