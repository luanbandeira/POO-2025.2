public class Circulo{
    public static final double PI = 3.1415;   //acessar um static atraves da classe pois é reutilizado pra classe toda 
    double raio;                               //


    double comprimento(){
        return 2* PI * raio;
    }

    double area(){
        return PI * raio * raio;
    }


    public Circulo(double raio){
        this.raio = raio;
    }
}