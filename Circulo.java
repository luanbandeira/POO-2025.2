public class Circulo{
    double raio;


    double comprimento(){
        return 2* 3.14 * raio;
    }

    double area(){
        return 3.14 * raio * raio;
    }


    public Circulo(double raio){
        this.raio = raio;
    }
}