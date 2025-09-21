import java.util.ArrayList;

public class Cat extends Animal{
    public Cat(){
        super(2, "wisk", 5, 2.0);
        this.getHabilidades().add("agility");
    }
    @Override
    public String som(){
        return "meow";
    }
}
