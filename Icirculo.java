public class Icirculo implements FormaGeometrica {
    private double raio;
    private static final double PI = 3.14;

    // Construtor
    public Icirculo(double raio) {
        this.raio = raio;
    }

    @Override
    public double area() {
        return PI * raio * raio;
    }

    // Método extra (não está na interface)
    public double comprimento() {
        return 2 * PI * raio;
    }
}
