public class Animal {
    private String som;
    private String dormiu;

    public Animal( String som, String dormiu){
        this.som = som;
        this.dormiu = dormiu;
    }

    public String fazerSom(){
        return som;
    }

    public String dormir(){
        return dormiu;
    }
}
