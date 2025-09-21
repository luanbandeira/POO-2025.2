public class Bird extends Animal{
    public Bird(){
        super(001,"piupiu", 7, 0.7);
        this.getHabilidades().add("fly");
        
    }

    @Override
    public String som(){
        return "piu";
    }
    
}
